package controle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe o número:");

        int numero = Integer.parseInt(valor);
        if (numero % 2 == 0) {
            System.out.println("Número par!");
        } else if (numero % 2 == 1) {
            System.out.println("Número impar!");
        } else {
            System.out.println("Não é um número válido!");
        }

    }
}
