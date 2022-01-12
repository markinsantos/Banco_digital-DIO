package entidades;

public abstract class Conta {
    private static Integer GERADORCONTA=1;
    protected Integer numeroConta;
    protected final String agencia = "0001";
    protected Double saldo;

    public Conta( Double saldo) {
        this.numeroConta = GERADORCONTA++;
        this.saldo = saldo;
    }

    public Conta() {
    }

    public Double getSaldo() {
        return saldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void sacar(Double valor){
        this.saldo = saldo-valor;
    }
    public void depositar(Double valor){
        this.saldo = saldo+valor;
    }
    public void transferir(Conta conta,Double valor){
    this.sacar(valor);
    conta.depositar(valor);
    }


}
