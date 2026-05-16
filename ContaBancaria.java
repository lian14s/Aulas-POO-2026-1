public abstract class ContaBancaria {
    private String cliente;
    private int numConta;
    private float saldo;

    public ContaBancaria(String cliente, int numConta){
        this.cliente = cliente;
        this.numConta = numConta;
        saldo = 0;

    }

    public void sacar(float valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("------------------------------");
            System.out.println("Valor: " + valor + " sacado com sucesso!");
            System.out.println("------------------------------ \n");

        } else {
            System.out.println("Valor inválido ou negativo!");
        }
    }

    public void depositar(float valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("------------------------------");
            System.out.println("Valor: " + valor + " depositado com sucesso!");
            System.out.println("Saldo total: " + getSaldo());
            System.out.println("------------------------------ \n");

        } else {
            System.out.println("Valor inválido digitado!");
            System.out.println("------------------------------");
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float valor){
          this.saldo = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public abstract void consultarSaldo();
}

