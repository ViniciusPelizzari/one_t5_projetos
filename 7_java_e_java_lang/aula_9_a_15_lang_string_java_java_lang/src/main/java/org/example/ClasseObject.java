package org.example;

public class ClasseObject { //se quiser pode ser extendida a classe object /*extends object*/ - mas se não colocar nada, ela é automaticamente extendida
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println('a');
        System.out.println("abc");
        System.out.println(true);

        //sobrecarga de método - mesmos métodos com implementação diferente
        imprimir(3);
        imprimir('b');
        imprimir("abcde");
        imprimir(false);

        //pode ser passado ao println qualquer tipo de referencia
        Referencia r = new Referencia(33, "referencia qualquer ao println");
        imprimir(r);
        imprimir(new Referencia(44, "testando referencias"));

        Object o = new Referencia(55, "testando classe object"); // ela serve para referenciar qualquer objeto - universal
        imprimir(o.toString());
    }

    static void imprimir(int i){
        System.out.println(i);
    }
    static void imprimir(char c){
        System.out.println(c);
    }
    static void imprimir(String s){
        System.out.println(s);
    }
    static void imprimir(boolean b){
        System.out.println(b);
    }
    static void imprimir(Referencia referencia){
        System.out.println(referencia);
    }
}
