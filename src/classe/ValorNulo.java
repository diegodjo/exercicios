package classe;

public class ValorNulo {
    public static void main(String[] args) {
        String n1 = "";
        System.out.println(n1.concat("!!!"));

        String n2 = ""; // apagar as aspas "" e o igual =
        System.out.println(n2.concat("???")); // não podemos usar! Pois a variável não foi inicializada

        String n3 = null;
        System.out.println(n3.concat("??")); // Variavel é nula e mesmo assim dará erro,
        // pois não podemos acessar atributos e metodos nulos que não são apontados em memória.


    }
}
