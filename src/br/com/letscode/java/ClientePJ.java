package br.com.letscode.java;

public class ClientePJ extends Cliente {
    private String cnpj;
    private String inscEst;

    public ClientePJ() {

    }

    public ClientePJ(String nome, String endereco, String telefone, String email, String cnpj, String inscEst) {
        super(nome, endereco, telefone, email);
        this.cnpj = cnpj;
        this.inscEst = inscEst;
    }
}
