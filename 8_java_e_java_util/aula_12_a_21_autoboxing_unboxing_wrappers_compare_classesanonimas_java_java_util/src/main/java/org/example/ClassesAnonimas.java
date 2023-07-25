package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClassesAnonimas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(33, 312);
        cc.depositar(33);
        ContaCorrente cc1 = new ContaCorrente(33, 259);
        cc1.depositar(22);
        ContaCorrente cc2 = new ContaCorrente(33, 759);
        cc2.depositar(11);

        List<Conta> contas= new ArrayList<>();

        contas.add(cc);
        contas.add(cc1);
        contas.add(cc2);

        for(Conta conta : contas){
            System.out.println(conta.toString());
        }
        System.out.println();

        //Function Object
        //NumeroContaCompare2 comparator = new NumeroContaCompare2();
        //contas.sort(comparator);

        //classes anonimas
        contas.sort(new Comparator<Conta>() {
                @Override
                public int compare(Conta o1, Conta o2) { //sobrescrevendo metodo
                    return Integer.compare(o1.getNumero(), o2.getNumero());
                }
            }
        );

        for(Conta conta : contas){
            System.out.println(conta.toString());
        }
        System.out.println();

        //classes anonimas
        Comparator<Conta> comparator = new Comparator<Conta>() {
            @Override
            public int compare(Conta o1, Conta o2) { //sobrescrevendo metodo
                if (o1.getSaldo() < o2.getSaldo()) {
                    return -1;
                } else if (o1.getSaldo() > o2.getSaldo()) {
                    return 1;
                }
                return 0;
            }
        };
        contas.sort(comparator);

        for(Conta conta : contas){
            System.out.println(conta.toString());
        }
    }
}
