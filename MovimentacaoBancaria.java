public class MovimentacaoBancaria {

    public MovimentacaoBancaria() {

        ContaPoupanca poupanca = new ContaPoupanca("Lian", 123456,10);

        poupanca.depositar(500);
        poupanca.sacar(250);

        poupanca.calcularNovoSaldo(5);

        poupanca.depositar(200);

        poupanca.consultarSaldo();

        ContaEspecial especial = new ContaEspecial("João", 999999,1500);

        especial.depositar(1000);
        especial.sacar(500);

        especial.sacar(1900);

        especial.consultarSaldo();


    }
    public static void main(String[] args) {
        new MovimentacaoBancaria();

    }
}