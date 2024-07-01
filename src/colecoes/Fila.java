package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adicionam elementos na fila
        // Diferença é o comportamento quando a fila está cheia!

        // .add() lançará uma exceção caso a fila esteja cheia.
        // .offer() retorna falso caso a fila esteja cheia.

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> obter o próximo elemento da fila (sem remover)
        System.out.println(fila.peek()); // Retorna null, se não tiver nada na fila
        System.out.println(fila.peek()); // Retorna null, se não tiver nada na fila
        System.out.println(fila.element()); // Retorna Exception, se não tiver nada na fila
        System.out.println(fila.element()); // Retorna Exception, se não tiver nada na fila

        // fila.size();
        // fila.clear();
        // fila.isEmpty(); // Se a fila está ou não vazia.

        System.out.println(fila.poll()); // retorna null
        System.out.println(fila.remove()); // Lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());




        System.out.println(fila.poll()); // como nao existe o 7º elemento depois do Gui, vem como null.

    }
}
