import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos alunos deseja cadastrar?");
        int qtdAluno = sc.nextInt();

        Aluno[] alunos = new Aluno[qtdAluno];

        for (int i=0; i < qtdAluno; i++){
            alunos[i] = addAluno();
        }

        // foreach, igual c#
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.nome);
        }

    }

    static void inicio (){
        
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
