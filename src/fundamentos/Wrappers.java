package fundamentos;

//import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {

        //Scanner entrada = new Scanner(System.in);
        // byte
        Byte b = 100;
        Short s = 1000;

        // i = Integer.parseInt(entrada.next()); // int

        Integer i = 10000; // int
        Long l = 10000L;

        System.out.println(b.byteValue());
        System.out.println(s.shortValue());
        System.out.println(i * 3);
        System.out.println(l / 3);

        //entrada.close();

        Float f = 123.10f; // float
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bool = Boolean.parseBoolean("true"); // boolean
        System.out.println(bool);
        System.out.println(bool.toString().toUpperCase());

        Character c = '#'; // char
        System.out.println(c);

    }
}
