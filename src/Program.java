import entidades.Cliente;
import entidades.Conta;
import entidades.ContaCorrente;
import entidades.ContaPoupanca;

public class Program {

    public static void main(String[] args) {

    Cliente cliente = new Cliente("marcos","000.000.000-00",new ContaCorrente(1000.00));
    Cliente cliente1 = new Cliente("marcelo","022.000.000-00",new ContaCorrente(2000.00));
    Cliente cliente2 = new Cliente("maria","022.025.000-00",new ContaPoupanca(2000.00));
        System.out.println(cliente);
        System.out.println(cliente1);
        System.out.println(cliente2);
        cliente.conta.sacar(20.00);
        cliente.conta.transferir(cliente2.conta,100.00);
        System.out.println(cliente);
        System.out.println(cliente2);
    }
}
