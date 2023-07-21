package org.example;

public class Referencia {
    public Referencia(int num, String nome){
        System.out.println(num + ", " + nome);
    }

    @Override
    public String toString() { //sobrescrevendo método da classe object
        return "reescrevendo método toString";
    }
}
