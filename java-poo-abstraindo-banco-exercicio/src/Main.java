public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("José Marcos","09745545775");
        Cliente cliente2 = new Cliente("Maria Antônia","09756237231");

        cliente1.imprimirDadosCliente();
        cliente2.imprimirDadosCliente();

        ContaCorrente conta1 = new ContaCorrente(cliente1);
        ContaPoupanca conta2 = new ContaPoupanca(cliente2);

        conta1.depositar(1000);
        conta2.depositar(2000);
        conta1.transferir(200,conta2);

        conta1.ImprimirExtrato();
        conta2.imprimirExtrato();
    

    }
}
