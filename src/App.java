import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String FLAG;

        do {
            addAluno();
            FLAG = finalizarPrograma();
        } while (!FLAG.equals("fim"));

    }

    static String finalizarPrograma (){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n[c] Continuar, [fim] Sair");
        return sc.next();
    }

    static void addAluno () {

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Adicionar Aluno");
        System.out.print("Nome: ");
        aluno.nome = sc.next();
        System.out.print("Nota 1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        aluno.nota2 = sc.nextDouble();

        System.out.println("\nAluno: " + aluno.nome);
        System.out.println("Nota 1: " + aluno.nota1);
        System.out.println("Nota 2: " + aluno.nota2);
        System.out.println("Média: " + aluno.media(aluno.nota1, aluno.nota2));
        System.out.println(aluno.situacao(aluno.nota1, aluno.nota2));

    }
}
