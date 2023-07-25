package org.example;

public class ContaPoupanca extends Conta{
    //Em uma herança, a classe filha herda os atributos e os métodos, mas NÃO herda os construtores
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }
}
