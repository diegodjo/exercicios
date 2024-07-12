package oo.encapsulamento.casaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcessos() {
        // segredo
        // facoDentroDeCasa
        // formaDeFalar
        // todosSabem
        // System.out.println(esposa.segredo); // somente a Ana pode acessar, é algo provado!
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);

    }
}
