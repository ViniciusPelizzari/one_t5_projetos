package org.example;

import java.util.Objects;

public abstract class Conta {
    private int agencia;
    private int numero;
    private static int total;

    public Conta(int agencia, int numero){
        total++;
        System.out.println("Total de contas: " + total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Criação da conta: " + numero + " | Agência: " + agencia);
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Agência não pode ser 0 nem negativa!");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0){
            System.out.println("Número da conta não pode ser 0 nem negativa!");
            return;
        }
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conta conta)) return false;
        return getAgencia() == conta.getAgencia() && getNumero() == conta.getNumero();
    }

    /*Override
    public boolean equals(Object ref) {

        Conta outra = (Conta) ref;

        if(this.agencia != outra.agencia) {
            return false;
        }

        if(this.numero != outra.numero) {
            return false;
        }

        return true;
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(getAgencia(), getNumero());
    }

    @Override
    public String toString() {
        return "Agência: " + getAgencia() + " | Número: " + getNumero();
    }
}