package oo.composicao;

public class Carro {

    Motor motor;
//    Motor motor = new Motor();

    Carro() {
        this.motor = new Motor(this); // o proprio objeto atual pode construir um motor, o carro tem um motor e o motor tem um carro
    }
    void acelerar() {
        if (motor.fatorInjecao < 2.6) {
            motor.fatorInjecao += 0.4;
        }
    }
    void frear() {
        if (motor.fatorInjecao >= 0.5) {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }

}
