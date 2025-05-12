package cliente;
import conta.Conta;

public class Cliente {
    private String nome;
    private long cpf;

    public String getNome() {
        return nome;
    }
    public long getCpf() {
        return cpf;
    }
    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
