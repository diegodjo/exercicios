package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionario

        //Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulado = 1234567L;

        //Tipos numéricos reais
        float salario = 11_145.44F;
        double vendasAcumuladas = 1234567.89;

        //Tipo booleano
        boolean estaDeFerias = true;
        boolean permitidoFazerVoos = false;

        //Tipo caractere
        char status = 'A';
        char teste = '?';
        char outroTeste = '1';

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Numero de viagens
        System.out.println(numeroDeVoos / 2);

    }
}
