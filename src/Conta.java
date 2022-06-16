
    public abstract class Conta implements IConta {
        private static int SEQUENCIAL = 1;
        private static final int AGENCIA_PADRAO = 1;
        protected int agencia;
        protected int conta;
        protected double saldo;
        protected Cliente cliente;

        public Conta(Cliente cliente) {
            this.agencia = Conta.AGENCIA_PADRAO;
            this.conta = SEQUENCIAL++;
            this.cliente = cliente;
        }

        public int getAgencia() {
            return agencia;
        }

        public int getConta() {
            return conta;
        }

        public double getSaldo() {
            return saldo;
        }

        @Override
        public void sacar(double valor) {
            this.saldo -= valor;
        }

        @Override
        public void depositar(double valor) {
            this.saldo += valor;
        }

        @Override
        public void transferir(double valor, Conta contaDestino) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }

        protected void imprimirInfConta() {
            System.out.printf(String.format("\n Titular: %s", this.cliente.getNome()));
            System.out.printf(String.format("\n Agencia: %d", this.agencia));
            System.out.printf(String.format("\n Conta: %d", this.conta));
            System.out.printf(String.format("\n Saldo: %.2f", this.saldo));
        }
    }
