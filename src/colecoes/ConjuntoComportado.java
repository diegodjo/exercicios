package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
//      Set<String> listaAprovados = new HashSet<String>(); // não mantem a ordem adicionada
//      Set<String> listaAprovados = new TreeSet<>();

        SortedSet<String> listaAprovados = new TreeSet<>(); // mantem a ordem adicionada
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Lucas");
        listaAprovados.add("Pedro");

        for(String candidato : listaAprovados) {
            System.out.println(candidato);
        }


        Set<Integer> nums = new HashSet<>(); // não mantem a ordem adicionada
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        // nums.get(1); não é possível acessar pelo índice

        for(Integer num : nums) {
            System.out.println(num);
        }


    }
}
