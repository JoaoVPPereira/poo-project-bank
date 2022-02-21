package br.com.letscode.java;

public class ClientePF extends Cliente {
    private String cpf;
    private int idade;

    public ClientePF() {

    }

    public ClientePF(String nome, String endereco, String telefone, String email, String cpf, int idade) {
        super(nome, endereco, telefone, email);
        this.cpf = cpf;
        this.idade = idade;
    }


}
