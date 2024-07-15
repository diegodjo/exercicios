package oo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", 30);

        System.out.println("Nome: " + p1.getNome() + ", Idade: " + p1.getIdade());
        System.out.println(p1); // toString
    }
}
