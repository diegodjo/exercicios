package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");

        // Inicia com "Boa", será true se for verdadeiro
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("BoA"));

        // Termina com dia?
        System.out.println("Termina com tarde?: Resultado = " + s.endsWith("tarde"));

        System.out.println(s.toLowerCase().startsWith("boa"));

        // Quantos caracteres tem essa string?
        System.out.println("Resultado de caracteres: " + s.length());

        // É igual?
        System.out.println(s.equals("boa tarde"));

        // Ignorar se é maíuscula ou minúscula
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 1000.00;

        System.out.println("Nome: " + nome
                + ", Sobrenome: " + sobrenome
                + ", Idade: " + idade
                + ", Salario: " + salario);

        System.out.printf("O senhor: %s %s tem %d anos e ganha R$%.2f de salário.", nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor: %s %s tem %d anos e ganha R$%.2f de salário.", nome, sobrenome, idade, salario);
        System.out.println(frase);
    }
}
