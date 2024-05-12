import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um numero");
        Scanner sc = new Scanner(System.in);

        double n;
        n = sc.nextDouble();

        System.out.println("Numero: " + n);
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
