package org.example.ArrayList;

import org.example.Cliente;
import org.example.ContaCorrente;

import java.util.ArrayList;

public class ArrayListComParametros {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        //<> - se chamam generics

        ContaCorrente cc = new ContaCorrente(33, 3);
        //clientes.add(cc); //não é possível adicionar outro tipo de objeto que nao seja o que foi especificado
        Cliente vinicius = new Cliente();
        vinicius.setNome("Vinícius");
        clientes.add(vinicius);
        Cliente kamila = new Cliente();
        clientes.add(kamila);
        Cliente benicio = new Cliente();
        clientes.add(benicio);

        System.out.println(clientes.size()); //verificando tamanho da lista

        Cliente ref = clientes.get(0);
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

        clientes.remove(3); //removendo item 3 da lista
        System.out.println(clientes.size()); //verificando tamanho da lista

        for(int i = 0; i < clientes.size(); i++){
            Object oRef = clientes.get(i);
            System.out.println(oRef);
        }
    }
}
