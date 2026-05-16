public class ContaEspecial extends ContaBancaria{
    private float limite;

    public ContaEspecial(String cliente, int numConta, float limite){
        super(cliente, numConta);
        this.limite = limite;

    }

    public void sacar(float valor){
        if (valor > 0){
        float dinheiroDisponivel = getSaldo() + limite;

        if(valor <= dinheiroDisponivel){
            float novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
            System.out.println("------------------------------");
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            System.out.println("Novo saldo atualizado: R$ " + novoSaldo);
            System.out.println("------------------------------ \n");
            }
        else{
            System.out.println("Erro: Saldo e limite insuficientes.");
            System.out.println("Valor solicitado: R$ " + valor + " | Total disponível: R$ " + dinheiroDisponivel);
            System.out.println("------------------------------ \n");
        }
        }

    }

    public void consultarSaldo() {
        System.out.println("--- Conta Especial ---");
        System.out.println("Cliente: " +getCliente());
        System.out.println("Número da Conta: " + getNumConta());
        System.out.println("Saldo da Conta Especial: R$ " + getSaldo());
        System.out.println("Limite de Crédito Disponível: R$ " + limite);
        System.out.println("---------------------- \n");

    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
}
