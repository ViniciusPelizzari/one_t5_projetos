package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenandoListas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(33, 312);
        cc.depositar(33);
        ContaCorrente cc1 = new ContaCorrente(33, 325);
        cc1.depositar(22);
        ContaCorrente cc2 = new ContaCorrente(33, 351);
        cc2.depositar(11);

        List<Conta> contas= new ArrayList<>();

        contas.add(cc);
        contas.add(cc1);
        contas.add(cc2);

        for(Conta conta : contas){
            System.out.println(conta.toString());
        }
        System.out.println();

        contas.sort(new NumeroContaCompare()); //como só vai ser usada a classe para este metodo - simplificamos a inicializacao
        //.sort() - reordena os itens da lista conforme o método de comparacao passada
        //este metodo foi implementado no Java a partir da versao 1.8

        //antes usava-se
        Collections.sort(contas, new NumeroContaCompare()); //mesma coisa e lógica - passa-se a lista e o comparador
        Collections.sort(contas); //fazendo a comparação conforme ordem natural da classe Conta - implementada a classe Comparable
        Collections.reverse(contas); //reordena a lista - do maior ao menor elemento

        for(Conta conta : contas){
            System.out.println(conta.toString());
        }
        System.out.println();

        contas.sort(new SaldoContaCompare());

        for(Conta conta : contas){
            System.out.println(conta.toString());
        }
    }
}

//criando classes para implementar metodo de comparacao
class NumeroContaCompare implements Comparator<Conta>{

    @Override
    public int compare(Conta o1, Conta o2) { //sobrescrevendo metodo
        return Integer.compare(o1.getNumero(), o2.getNumero());

        //return o1.getNumero() - o2.getNumero(); //se forem iguais = 0, se for menor = negativo, se for maior = positivo

        /*if(o1.getNumero() < o2.getNumero()){
            return -1;
        } else if(o1.getNumero() > o2.getNumero()){
            return 1;
        }
        return 0;*/
    }
}

class SaldoContaCompare implements Comparator<Conta>{

    @Override
    public int compare(Conta o1, Conta o2) { //sobrescrevendo metodo
        if(o1.getSaldo() < o2.getSaldo()){
            return -1;
        } else if (o1.getSaldo() > o2.getSaldo()){
            return 1;
        }
        return 0;
    }
}
