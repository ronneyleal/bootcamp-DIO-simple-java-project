public class Main {

    public static void main(String[] args) {

        Cliente ronney = new Cliente();
        ronney.setNome("Ronney");

        Conta cc = new ContaCorrente(ronney);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(ronney);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
