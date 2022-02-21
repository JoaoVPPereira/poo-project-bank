package br.com.letscode.java;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {

    public ContaCorrente(String agencia, String conta, double saldo, Cliente cliente) {
        super(agencia, conta, saldo, cliente);
    }
}
