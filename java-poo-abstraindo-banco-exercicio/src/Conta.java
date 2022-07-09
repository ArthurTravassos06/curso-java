public abstract class Conta {
    private static final int AGENCIA_WEB_BANK = 1;
    private static int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_WEB_BANK;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }

    public void sacar(double valor){
        this.saldo -= valor;

    }
    public void depositar(double valor){
        this.saldo += valor;

    }

    public void transferir(double valor, Conta conta){
        this.sacar(valor);
        conta.depositar(valor);
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

    protected void imprimirDadosConta() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
