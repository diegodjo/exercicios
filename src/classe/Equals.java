package classe;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        usuario1.nome = "Diego Alves";
        usuario1.email = "diegoalves@email.com.br";

        Usuario usuario2 = new Usuario();
        usuario2.nome = "Diego Alves";
        usuario2.email = "diegoalves@email.com.br";

        System.out.println(usuario1 == usuario2); // vai dar falso, pq são objetos diferentes na memória
        System.out.println(usuario1.equals(usuario2)); // vai dar falso, pq são objetos diferentes na memória

        System.out.println(usuario2.equals(new Date()));
    }
}
