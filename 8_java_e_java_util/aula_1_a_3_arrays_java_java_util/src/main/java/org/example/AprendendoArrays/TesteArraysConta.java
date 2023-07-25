package org.example.AprendendoArrays;

public class TesteArraysConta {
    public static void main(String[] args) {
        ContaCorrente[] contas = new ContaCorrente[5];
        ContaCorrente cc1 = new ContaCorrente(33, 333);
        //criando uma conta - já tem uma referencia que é a cc1
        contas[0] = cc1; //criando outra referencia a cc1 - contas[0]

        System.out.println(contas[0].getAgencia() + "|" + contas[0].getNumero());
        ContaCorrente refcc1 = cc1; //criando outra referencia a cc1 - ref
        System.out.println(refcc1.getAgencia() + "|" + refcc1.getNumero());

        ContaCorrente cc2 = new ContaCorrente(22, 222);
        contas[1] = cc2;
    }
}
