
public class Aluno {
    public String nome;
    public double nota1, nota2;

    public static double media (double n1, double n2){
        double m = (n1 + n2) / 2;
        return m;
    }

    public static String situacao (double n1, double n2){
        if (media(n1, n2) >= 6){
            return "Aluno Aprovado";
        }else {
            return "Aluno em prova final";
        }
    }
}
