package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];
        System.out.println("-----------------------------------");
        System.out.println("Notas Aluno A:");


        System.out.println(Arrays.toString(notasAlunoA)); // Array é criado mas tudo zerado

        notasAlunoA[0] = 7.9; // alterando notas
        notasAlunoA[1] = 8; // alterando notas
        notasAlunoA[2] = 6.7; // alterando notas
        notasAlunoA[3] = 9.7; // alterando notas

        System.out.println(notasAlunoA); // só mostra a referência
        System.out.println(Arrays.toString(notasAlunoA)); // acessar o array
        System.out.println(notasAlunoA[0]); // acessando pelo indice
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);

        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }
        System.out.println(totalAlunoA / notasAlunoA.length);

        System.out.println("-----------------------------------");
        System.out.println("Notas Aluno B:");


        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
        System.out.println(Arrays.toString(notasAlunoB));

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println(totalAlunoB / notasAlunoB.length);

    }
}
