package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3)); // pegando pelo toString formatado

        lista.remove(1); // remover elemento da lista pelo índice. No caso é o Carlos!
        System.out.println(">>>>>>" + lista.remove(1));

        lista.remove(new Usuario("Manu")); // remover elemento da lista a partir de um Objeto.
        System.out.println("1) Tem? " + lista.contains(u1));
        System.out.println("2) Tem? " + lista.contains(new Usuario("Lia")));





        for (Usuario u : lista) {
            System.out.println(u.nome);
        }

        for (Usuario u : lista) {
            System.out.println("toString Formatado: " + u);
        }


    }
}
