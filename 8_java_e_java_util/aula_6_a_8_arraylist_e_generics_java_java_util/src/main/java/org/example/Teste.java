package org.example;

public class Teste {
    public static void main(String[] args) {
        AdapterArrays adapterArrays = new AdapterArrays();

        ContaCorrente cc = new ContaCorrente(33, 3);
        adapterArrays.adiciona(cc);
        ContaCorrente cc1 = new ContaCorrente(333, 33);
        adapterArrays.adiciona(cc1);
        ContaCorrente cc2 = new ContaCorrente(3333, 333);
        adapterArrays.adiciona(cc2);
        ContaCorrente cc3 = new ContaCorrente(33333, 3333);
        adapterArrays.adiciona(cc3);

        int tamanho = adapterArrays.getQuantidadeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) adapterArrays.getReferencias(0);
        System.out.println(ref.getAgencia());
    }
}
