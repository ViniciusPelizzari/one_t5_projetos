package org.example;

import java.util.LinkedList;

public class ConhecendoLinkedist {
    //em um linkedList, mantem-se a ordem de inserção dos dados - ex: a conta (cc) que foi inserida na posição 0, sempre estará nesta posição
    //caso tenha uma lista com 4 elementos: 1,2,3,4  -  e for apagado o 3, ficará: 1,2,4 - os outros se ajustaram a sua posição
    //é difícil o acesso a um elemento específico - acessar o elemento 5 - é necessário passar por todos os elementos anteriores até chegar na posição desejada

    public static void main(String[] args) {
        LinkedList<Cliente> clientes = new LinkedList<Cliente>();

        Cliente vinicius = new Cliente();
        clientes.add(vinicius);
        Cliente kamila = new Cliente();
        clientes.add(kamila);
        Cliente benicio = new Cliente();
        clientes.add(benicio);
        benicio.setNome("Benício");

        System.out.println(clientes.size());

        Cliente ref = clientes.get(2);
        System.out.println(ref.getNome());

        for(int i = 0; i < clientes.size(); i++){
            Object oRef = clientes.get(i);
            System.out.println(oRef);
        }

        System.out.println();
        //MESMO FOR
        for(Object oRef : clientes){
            System.out.println(oRef);
        }

        clientes.remove(0);
        System.out.println(clientes.size());

        for(int i = 0; i < clientes.size(); i++){
            Object oRef = clientes.get(i);
            System.out.println(oRef);
        }
    }
}