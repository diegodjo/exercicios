package classe;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.89);
        // p1.nome = "Notebook";
        // p1.preco = 4356.89;
        // p1.desconto = 0.25;

        var p2 = new Produto("Caneta Preta", 12.56);
        // p2.nome = "Caneta Preta";
        // p2.preco = 12.56;
        // p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);


        double precoFinal1 = p1.precoComDesconto(0);
        double precoFinal2 = p2.precoComDesconto(0.25);

        double mediaCarrinho = (precoFinal1 + precoFinal2)/2;

        System.out.printf("Media do carrinho = R$%.2f.\n", mediaCarrinho);

        Produto p3 = new Produto("Produto com Desconto", 4356.89);
        Produto.desconto = 0.29;
        System.out.println(p3.nome + " R$" + p3.precoComDesconto() );


    }
}
