package br.com.letscode.java;

import java.math.BigDecimal;

public abstract class Conta {
    protected String agencia;
    protected String conta;
    protected double saldo;
    Cliente cliente;

    public Conta() {

    }

    public Conta(String agencia, String conta, double saldo, Cliente cliente) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacarPF(double valor) {
       if (saldo < valor) {
           System.out.println("Saldo insuficiente");
       }
       else {
           saldo -= valor;
       }
    }

    public void sacarPJ(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente");
        }
        else {
            saldo -= valor * 1.005;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void investirPF(double valor) {
        saldo += valor * 1.04;
    }

    public void investirPJ(double valor) {
        saldo += valor * 1.06;
    }

    public void consultarSaldo() {
        System.out.println("Saldo = " + saldo);
    }

    public void transferir(Conta conta, double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente");
        }
        else {
            this.sacarPF(valor);
            conta.depositar(valor);
        }
    }


    @Override
    public String toString() {
        return "Conta{" +
                "agencia='" + agencia + '\'' +
                ", conta='" + conta + '\'' +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
