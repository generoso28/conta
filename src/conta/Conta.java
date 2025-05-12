package conta;
import cliente.Cliente;

import java.util.HashSet;
import java.util.Set;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private Set<Cliente> clientes;

    public Conta(int numero, float limite){
        clientes = new HashSet<>();
        this.numero = numero;
        this.limite = limite;
    }

    public void getClientes(){
        System.out.println("Conta: " + numero);
        for (Cliente cliente : clientes) {
            if (cliente != null){
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
            }
        }
    }
    public void setClientes(Cliente cliente){
        clientes.add(cliente);

    }
    public void sacar(float quantia){
        if (quantia <= saldo + limite){
            saldo -= quantia;
            System.out.println("Saque realizado com sucesso");
            System.out.println("Saldo atual: " + saldo);
        }
        else{
            System.out.println("Saldo insuficiente");
            System.out.println("Saldo atual: " + saldo);
        }
    }
    public void depositar(float quantia){
        saldo += quantia;
        System.out.println("Depósito realizado com sucesso");
        System.out.println("Saldo atual: " + saldo);
    }
    public void mostraInfo(){
        System.out.println("Número da conta: " + numero);
        for(Cliente cliente : clientes){
            try{
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
            }catch(NullPointerException e){
                System.out.println("Cliente não encontrado");
            }

        }
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
    }
}
