package org.example;

public class ContaCorrente extends Conta {
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override public boolean sacar(double valor) {
        double taxaSaque = 0.20;
        double valorSacado = valor + taxaSaque;
        return super.sacar(valorSacado);
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }
}
