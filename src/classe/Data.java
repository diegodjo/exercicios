package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data() {
        dia = 01;
        mes = 01;
        ano = 1970;
    }

    Data(int dataDia, int dataMes, int dataAno) {
        dia = dataDia;
        mes = dataMes;
        ano = dataAno;
    }

    String obterDataFormatada(){
        return String.format("%d/%d/%d\n", dia, mes, ano);
    }

    void imprimirDataFormatada(){
        System.out.printf("Imprimindo data formatada pelo Print: %d/%d/%d\n", dia, mes, ano);
        System.out.printf("Imprimindo data formatada porém chamando outra função: " + obterDataFormatada());
    }

}
