package org.example;

public class AprendendoSobreString { //não precisa ser importada
    public static void main(String[] args) { //estudando classe String - IMUTÁVEL
        //classe String tem muitos métodos

        //String é uma CLASSE
        String nome = "Java"; //isto é um object literal - tem uma sintaxe literal para criar um objeto
        System.out.println(nome);
        String desenvolvedor = new String("Vinícius"); //como é classe pode ser instanciada assim, mas não é o correto
        System.out.println(desenvolvedor);

        System.out.println(nome.toUpperCase()); //a variavel pode ser alterada apenas em alguns casos
        nome.toUpperCase();
        System.out.println(nome); //não mudou o formato original da variável, por ela ser ímutavel

        System.out.println(desenvolvedor.replace('i', 'e'));
        //se eu quisesse ter uma variável com valores alterados, tem que criar outra
        String newNome = nome.replace("a", "A");
        System.out.println(newNome);

        String novoNome = newNome.replace("JA", "ja");
        System.out.println(novoNome);

        for(int i = 0; i < desenvolvedor.length(); i++){
            System.out.println(i + " - " + desenvolvedor.charAt(i));
        }

        String frase = "           JAVA - JDK";
        System.out.println(frase);
        System.out.println(frase.trim());
        System.out.println(frase.contains("AVA"));
    }
}