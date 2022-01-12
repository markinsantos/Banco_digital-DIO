package entidades;

public class ContaPoupanca extends Conta {
    private final Double taxa = 0.10;

    public ContaPoupanca( Double saldo) {
        super( saldo);
    }

    public ContaPoupanca() {
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
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta conta, Double valor) {
        this.sacar(valor);
        conta.depositar(valor);

    }

    @Override
    public String toString() {
        return  "numeroConta:" + numeroConta +'\n' +
                "agencia: " + agencia + '\n' +
                "saldo: " + saldo + '\n' +
                "taxa: " + taxa + '\n';
    }
}
