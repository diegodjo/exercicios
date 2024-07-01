package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1); // int -> Integer
        conjunto.add('x'); // char -> Caracteres

        System.out.println("Tamanho é: " + conjunto.size());

        conjunto.add("Teste"); // não foi inserido, pois não aceita repetições!
        conjunto.add('x'); // não foi inserido, pois não aceita repetições!

        System.out.println("Tamanho aqui será 5, pois temos 5 conjuntos!:\n" + "Tamanho:" + conjunto.size());

        // Removendo o "Teste":
        conjunto.remove("Teste");
        conjunto.remove('x');
        System.out.println("Tamanho aqui será 4, pois o Teste foi Removido!:\n" + "Tamanho:" +conjunto.size());

        //
        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(false)); // Resultado será falso, pois não contem no conjunto o false!


        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        // conjunto.addAll(nums); // união entre dois conjuntos. o conjunto incluiu nums dentro dele.
        conjunto.retainAll(nums); // contem o único valor em comum entre os conjuntos.
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);

    }
}
