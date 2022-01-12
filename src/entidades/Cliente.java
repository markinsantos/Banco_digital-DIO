package entidades;

public class Cliente {
    private String nome;
    private String cpf;
    public Conta conta;

    public Cliente(String nome, String cpf, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }



    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Dados do cliente: " +'\n' +
                "Nome: " + nome + '\n' +
                "CPF: " + cpf + '\n' +
                "Conta: " + conta;
    }
}
