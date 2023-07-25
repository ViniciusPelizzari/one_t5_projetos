package org.example;

public class ConhecendoArrays {
    //arrays sempre usam []
    public static void main(String[] args) {
        int idade1 = 10;
        int idade2 = 20;
        int idade3 = 30;
        int idade4 = 40;
        int idade5 = 50;

        System.out.println(idade1 + " | " + idade2 + " | " + idade3 + " | " + idade4 + " | " + idade5);

        int idades[] = new int[5]; //inicaliza os arrays com valor padrão = 0
        idades[0] = 10;
        idades[1] = 20;
        idades[2] = 30;
        idades[3] = 40;
        idades[4] = 50;

        for(int i = 0; i <idades.length; i++){
            idades[i] = i * i;
            //System.out.println(i);
            System.out.println(idades[i]);
        }

        //diferente da String que é imutável, o valor da variavel foi alterado após passar pelo for
        System.out.println(idades[3]);
    }
}