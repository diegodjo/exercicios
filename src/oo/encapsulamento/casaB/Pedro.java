package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    Ana mae = new Ana();

    void testeAcessos() {
        // segredo
        // facoDentroDeCasa
        // formaDeFalar
        // todosSabem

        // System.out.println(mae.segredo); // somente a Ana pode acessar, é algo provado!
        // System.out.println(mae.facoDentroDeCasa); // não está no mesmo pacote
        System.out.println(formaDeFalar);
        System.out.println(mae.todosSabem);

    }
}
