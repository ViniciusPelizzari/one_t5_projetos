package org.example;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxing {
    //AUTOBOXING - tipo primitivo para objeto referencia
    //UNBOXING - objeto referencia para tipo primitivo
    public static void main(String[] args) {
        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 19; //inicializando variavel do tipo PRIMITIVO

        //jeito certo de inicializar
        Integer idadeRef = Integer.valueOf(20); //inicializando variavel do tipo WRAPPER
        int valorInt = idadeRef.intValue(); //retornando valor para primitivo

        String DDDString = "45";
        Integer DDDInteger = Integer.valueOf(DDDString); //transformando valor de String em Integer - AUTOBOXING
        int DDDInt = Integer.parseInt(DDDString); //transformando valor de String em primitivo int - UNBOXING
        System.out.println("String: " + DDDString + " | DDDInteger : " + DDDInteger + " | DDDInt: " + DDDInt);

        System.out.println(DDDInteger.byteValue()); //transformando em byte
        System.out.println(DDDInteger.doubleValue()); //transformando em double

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        List<Integer> numeros = new ArrayList<Integer>(); //guarda valor referencias do tipo Integer
        numeros.add(idade);
        numeros.add(idadeRef);

        //pela lógica não deveria funcionar - adicionar um valor primitivo a uma lista que recebe object
        //mas para funcionar - o Java transforma o tipo primitivo int em um Integer (é uma classe)
        //para ajudar, o Java transforma os valores - aqui poderia ser recebido o (idadeRef, idade, 29)
        //essa transformação de tipo de dados se chama AUTOBOXING - tipo primitivo para objeto referencia

    }
}
