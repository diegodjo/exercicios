package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade máxima de notas: ");
        int qtdeNotas = entrada.nextInt();

        double[] notas = new double[qtdeNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double total = 0;
        for(double nota: notas) {
            total += nota;
        }
        System.out.println(Arrays.toString(notas));

        double media = total / qtdeNotas;
        System.out.print("A média é " + media + "!");

        entrada.close();
    }
}
