package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d = new Data();
        d.dia = 27;
        d.mes = 06;
        d.ano = 2024;

        System.out.printf("%d/%d/%d\n", d.dia, d.mes, d.ano);

        var d2 = new Data();
        d2.dia = 28;
        d2.mes = 06;
        d2.ano = 2024;

        System.out.printf("%d/%d/%d\n", d2.dia, d2.mes, d.ano);

        System.out.println("Retornando data formatada: " + d.obterDataFormatada());
        d.imprimirDataFormatada();


        Data d3 = new Data(27, 06, 2024);
        System.out.println(d3.obterDataFormatada());
    }
}
