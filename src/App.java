import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos deseja cadastrar?");
        int qtdAluno = sc.nextInt();

        int[] alunos = new int[qtdAluno];

        for (int i=0; i < qtdAluno; i++){
            
        }

    }

    static void addAluno () {

        Scanner sc = new Scanner(System.in);

        String nome;
        double nota1, nota2;

        System.out.println("Adicionar Aluno");
        System.out.print("Nome: ");
        nome = sc.next();
        System.out.print("Nota 1: ");
        nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        nota2 = sc.nextDouble();

    }
}
