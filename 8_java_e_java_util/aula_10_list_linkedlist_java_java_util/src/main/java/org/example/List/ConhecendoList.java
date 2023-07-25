package org.example.List;

import org.example.Cliente;

import java.util.LinkedList;
import java.util.List;

public class ConhecendoList { //List é a interface que define os métodos que existem no ArrayList e no LinkedList
    //list - pacote java.util - oferece métodos de manipulação
    //list - pacote java.awt - apresenta interface

    public static void main(String[] args) {
        //interface que implementa ArrayList e LinkedList
        List<Cliente> clientes = new LinkedList<Cliente>(); //deste jeito, caso queira mudar, é só trocar pelo ArrayList

        Cliente vinicius = new Cliente();
        clientes.add(vinicius);

        System.out.println(clientes.size());
    }
}
