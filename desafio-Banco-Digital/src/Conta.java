public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if(this.saldo > valor ){
            this.saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(double valor) {
            this.saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if(this.saldo > valor){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }else{
            System.out.println("Não foi possivel completar a operação, saldo insulficiente!");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("saldo R$: %.2f", this.saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    
}