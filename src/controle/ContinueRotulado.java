package controle;

public class ContinueRotulado {

    public static void main(String[] args) {

        externo:
        for (int contador = 0; contador < 3; contador++) {
            for (int contador2 = 0; contador2 < 3; contador2++) {
                if (contador == 1) {
                    continue externo;
                }
                System.out.printf("[%d %d] ", contador, contador2);
            }
            System.out.println();
        }
        System.out.println("Fim!");
    }
}

