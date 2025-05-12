import cliente.Cliente;
import conta.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(123, 1000);
        Cliente cliente1 = new Cliente("João", 123456789);
        Cliente cliente2 = new Cliente("Maria", 987654321);
        Cliente cliente3 = null;

        conta.setClientes(cliente1);
        conta.setClientes(cliente2);
        conta.setClientes(cliente3);
        conta.mostraInfo();
        conta.depositar(1000);
        conta.depositar(500);
        conta.sacar(200);
        conta.sacar(2000);
        conta.sacar(500);
    }
}