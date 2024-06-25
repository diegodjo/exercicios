package fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 5.0;


        String resultado = media >=7.0 ? "aprovado." : media <= 5.0 ? "reprovado." : "em recuperação.";

        System.out.println("O aluno está " + resultado);


    }
}
