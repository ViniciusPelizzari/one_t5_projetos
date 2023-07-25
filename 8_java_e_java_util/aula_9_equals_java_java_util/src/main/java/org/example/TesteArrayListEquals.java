package org.example;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<Conta>();
        //<> - se chamam generics

        ContaCorrente cc = new ContaCorrente(33, 333);
        contas.add(cc);
        ContaCorrente cc1 = new ContaCorrente(22, 222);
        contas.add(cc1);
        ContaCorrente cc2 = new ContaCorrente(22, 222);
        contas.add(cc2);

        for(Conta oRef : contas){
            if(oRef.equals(cc2)){
                System.out.println("Já existe");
            } else {
                System.out.println("Não existe");
            }
        }

        for(Conta oRef : contas){
            System.out.println(oRef);
        }

        System.out.println();

        boolean existeCc = contas.contains(cc2); //contain - verifica se o parametro passado existe
        System.out.println(existeCc);
    }
}