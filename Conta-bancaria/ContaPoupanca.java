public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String cliente, int numConta, int diaRendimento){
        super(cliente, numConta);
        this.diaRendimento = diaRendimento;

    }

    public  void calcularNovoSaldo(float taxaRendimento){
        float taxaDecimal = taxaRendimento / 100;
        float rendimento = getSaldo() * taxaDecimal;
        setSaldo(getSaldo() + rendimento);

        System.out.println("--- Atualização de Rendimento -");
        System.out.println("Taxa aplicada: " + taxaRendimento + "%");
        System.out.println("Valor creditado: R$ " + rendimento);
        System.out.println("Novo saldo: R$ " + getSaldo());
        System.out.println("-------------------------------\n");
    }

    public void consultarSaldo(){
        System.out.println("--- Conta Poupança ---");
        System.out.println("Cliente: " + getCliente());
        System.out.println("Número da Conta: " + getNumConta());
        System.out.println("Saldo da Poupança: R$ " + getSaldo());
        System.out.println("Dia do Rendimento: " + getDiaRendimento());
        System.out.println("----------------------- \n");
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
}
