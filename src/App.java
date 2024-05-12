import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        String FLAG;

        do {
            Aluno aluno = addAluno();
            alunos.add(aluno);
            FLAG = finalizarPrograma();
        } while (!FLAG.equals("fim"));

        // foreach, igual c#
        for (Aluno aluno : alunos) {
            System.out.println("\nAluno: " + aluno.nome);
            System.out.println("Nota 1: " + aluno.nota1);
            System.out.println("Nota 2: " + aluno.nota2);
            System.out.println("Média: " + aluno.media(aluno.nota1, aluno.nota2));
            System.out.println(aluno.situacao(aluno.nota1, aluno.nota2));
        }

    }

    static String finalizarPrograma (){
        Scanner sc = new Scanner(System.in);
        System.out.println("[c] Continuar, [fim] Sair");
        return sc.next();
    }

    static Aluno addAluno () {

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Adicionar Aluno");
        System.out.print("Nome: ");
        aluno.nome = sc.next();
        System.out.print("Nota 1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        aluno.nota2 = sc.nextDouble();

        return aluno;

    }
}
