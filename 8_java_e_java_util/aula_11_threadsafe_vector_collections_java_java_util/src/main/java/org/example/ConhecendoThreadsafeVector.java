package org.example;

import java.util.List;
import java.util.Vector;

public class ConhecendoThreadsafeVector {
    //vector - chamado threadsafe
    //pode ser usado em mais de um main, o contrário do ArrayList e LinkedList - manipulado em mais de uma pilha

    public static void main(String[] args) {
        //interface que implementa ArrayList, LinkedList e Vector
        List<Cliente> clientes = new Vector<Cliente>(); //deste jeito, caso queira mudar, é só trocar pelo ArrayList, LinkedList

        Cliente vinicius = new Cliente();
        clientes.add(vinicius);

        System.out.println(clientes.size());
    }
}
