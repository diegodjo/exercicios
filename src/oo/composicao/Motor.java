package oo.composicao;

public class Motor {

    // Relação bidirecional
    // o motor também tem um carro!
    Carro carro;

    Motor(Carro carro) {
        this.carro = carro;
    }

    boolean ligado = false;
    double fatorInjecao = 1;

    int giros() {
        if(!ligado) { // se não estiver ligado
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }
    }


}
