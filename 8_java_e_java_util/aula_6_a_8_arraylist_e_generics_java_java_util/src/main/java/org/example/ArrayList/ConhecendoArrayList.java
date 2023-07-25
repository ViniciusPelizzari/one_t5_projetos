package org.example.ArrayList;

import org.example.Cliente;
import org.example.Conta;
import org.example.ContaCorrente;

import java.util.ArrayList;

public class ConhecendoArrayList { //o limite de quantia de dados para o ArrayList é o tamaho da memória da JVM
    //em um arrayList, mantem-se a ordem de inserção dos dados - ex: a conta (cc) que foi inserida na posição 0, sempre estará nesta posição
    //caso tenha uma lista com 4 elementos: 1,2,3,4  -  e for apagado o 3, ficará: 1,2,?,4 - os outros manterão a sua posição inicial
    //é fácil de acessar um elemento especifico - acessar elemento na posição 5 - .get(5)
    //usa um array

    public static void main(String[] args) {
        ArrayList lista = new ArrayList(); //criando lista - sem parametros especificando o que pode ser aceito
        //ArrayList<Conta> lista = new ArrayList<Conta>(); //criando lista - parametro(<>) especificando que só pode ser aceito o tipo CONTA

        ContaCorrente cc = new ContaCorrente(33, 3);
        lista.add(cc); //adicionando item a lista
        ContaCorrente cc1 = new ContaCorrente(333, 33);
        lista.add(cc1);
        ContaCorrente cc2 = new ContaCorrente(3333, 333);
        lista.add(cc2);
        ContaCorrente cc3 = new ContaCorrente(33333, 3333);
        lista.add(cc3);

        System.out.println(lista.size()); //verificando tamanho da lista

        ContaCorrente ref = (ContaCorrente) lista.get(3); //passando item na posição 0 para outro objeto
        System.out.println(ref.getAgencia());  //verificando item referenciado na posição 0

        for(int i = 0; i < lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }
        //MESMO FOR
        for(Object oRef : lista){
            System.out.println(oRef);
        }

        lista.remove(3); //removendo item 3 da lista
        System.out.println(lista.size()); //verificando tamanho da lista

        for(int i = 0; i < lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        //clientes.add(cc); //não é possível adicionar outro tipo de objeto que nao seja o que foi especificado
    }


}
