package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer,String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto"); // adiciona ou substitui caso já exista!
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size()); //quantidade de elementos
        System.out.println(usuarios.isEmpty()); //  o elemento não está vazio! por isso que é false

        System.out.println(">>" + usuarios.keySet()); // conjunto das chaves
        System.out.println(usuarios.values()); // pegar os valores (nomes)
        System.out.println(usuarios.entrySet()); // pegar as chaves e os valores

        System.out.println(usuarios.containsKey(2)); // se contem aquela chave
        System.out.println(usuarios.containsValue("Rebeca")); // se contem aquela valor, retorna valor true ou false

        System.out.println(usuarios.get(4)); // obter o valor a partir da chave
        System.out.println(usuarios.remove(1)); // remover

        // percorrer os elementos do map
        // trazer as chaves:
        for(int chave: usuarios.keySet()){
            System.out.println(chave);

        }
        // trazer os valores:
        for(String valor: usuarios.values()){
            System.out.println(valor);
        }

        for (int valor: usuarios.keySet()){
            System.out.println(usuarios.keySet() + " e "+ usuarios.get(valor));
        }

        for(Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + "-");
            System.out.println(registro.getValue());
        }

    }
}
