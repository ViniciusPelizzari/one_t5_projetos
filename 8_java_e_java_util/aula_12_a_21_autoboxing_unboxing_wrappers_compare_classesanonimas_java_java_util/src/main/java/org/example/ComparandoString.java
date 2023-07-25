package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparandoString {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Eu");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Conta cc2 = new ContaCorrente(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Tu");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Nós");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Conta cc4 = new ContaCorrente(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Eles");
        cc4.setTitular(clienteCC4);
        cc4.depositar(222.0);

        List<Conta> contas= new ArrayList<>();

        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(cc4);

        contas.sort(new NumeroContaCompare());

        for(Conta conta : contas){
            System.out.println(conta.toString());
        }
        System.out.println();

        contas.sort(new NomeTitularCompare());

        for(Conta conta : contas){
            System.out.println(conta.toString());
            System.out.println(conta.getSaldo());
        }
        System.out.println();

        contas.sort(new NomeTitularCompare());

        for(Conta conta : contas){
            System.out.println(conta.getTitular().getNome());
        }
    }
}

class NomeTitularCompare implements Comparator<Conta>{
    @Override
    public int compare(Conta o1, Conta o2) {
        String nomeO1 = o1.getTitular().getNome();
        String nomeO2 = o2.getTitular().getNome();
        return nomeO1.compareTo(nomeO2);
    }
}
