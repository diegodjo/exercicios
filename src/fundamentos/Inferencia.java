package fundamentos;

public class Inferencia {
    public static void main(String[] args) {

        double a = 4.5;
        System.out.println(a);

        var b = 4.5;
        System.out.println("Inferir o tipo da variavel: " + b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);
    }
}
