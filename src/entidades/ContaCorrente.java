package entidades;

public class ContaCorrente extends Conta{
    private final Double taxa = 0.20;

    public ContaCorrente( Double saldo) {
        super( saldo);
    }
    public ContaCorrente() {
    }

    public Double getTaxa() {
        return taxa;
    }

    @Override
    public void sacar(Double valor) {
        this.saldo = saldo-(valor-taxa);
    }

    @Override
    public void depositar(Double valor) {
        this.saldo = saldo+valor;
    }

    @Override
    public void transferir(Conta conta, Double valor) {
        this.sacar(valor);
        conta.depositar(valor);
    }

    @Override
    public String toString() {
        return "numeroConta: " + numeroConta +'\n' +
                "agencia: " + agencia + '\n' +
                "saldo: " + saldo + '\n' +
                "taxa: " + taxa + '\n';
    }
}
