public class Exemplo {

    //um thread é uma linha de execução dentro de um programa Java.
    // Ele permite que partes diferentes do programa sejam executadas independentemente, ao mesmo tempo, em paralelo ou em sobreposição.
    public static void main(String[] args) {

        //definindo prioridade dos enums
        Prioridade pMin = Prioridade.MIN;
        Prioridade pNorm = Prioridade.NORMAL;
        Prioridade pMax = Prioridade.MAX;

        System.out.println(pMin.name());
        System.out.println(pNorm.name());
        System.out.println(pMax.name());
        //imprime o nome definido na classe Prioridade = MIN,NORM,MAX

        System.out.println(pMin.ordinal());
        System.out.println(pNorm.ordinal());
        System.out.println(pMax.ordinal());
        //imprime em ordem, o valor = 0,1,2

        Prioridadee peMin = Prioridadee.MIN;
        Prioridadee peNorm = Prioridadee.NORMAL;
        Prioridadee peMax= Prioridadee.MAX;
        Prioridadee peSup = Prioridadee.SUPER;
        Prioridadee peSupM = Prioridadee.SUPERMAX;

        System.out.println(peMin.name());
        System.out.println(peNorm.name());
        System.out.println(peMax.name());
        System.out.println(peSup.name());
        System.out.println(peSup.name());

        System.out.println(peMin.ordinal());
        System.out.println(peNorm.ordinal());
        System.out.println(peMax.ordinal());
        System.out.println(peSup.ordinal());
        System.out.println(peSupM.ordinal());

        System.out.println(peMin.getValor());
        System.out.println(peNorm.getValor());
        System.out.println(peMax.getValor());
        System.out.println(peSup.getValor());
        System.out.println(peSupM.getValor());



        //possíveis estados de um thread dentro da classe Thread
        //Thread.State.TERMINATED;
    }
}
