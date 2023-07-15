public class TryCatchArithmetic { //O bloco try apenas delimita a área na qual uma exceção pode ser lançada. É através do bloco catch que lidamos com a exceção capturada dentro de um bloco try.
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");

        System.out.println("\nIsto foi uma PILHA de execução");
    }

    /*private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            try { //dizendo ao complilador para tentar executar o código
                int a = i / 0; //Exception in thread "main" java.lang.ArithmeticException: / by zero at Fluxo.metodo2(Fluxo.java:20) at Fluxo.metodo1(Fluxo.java:12) at Fluxo.main(Fluxo.java:4)
            } catch (ArithmeticException exception){ //dizendo a máquina qual o erro pode acontecer
                System.out.println("ArithmeticException | ERRO: " + exception);
            }
        }
        System.out.println("Fim do metodo2");
    }*/

    //ou pode ser feito no método1 ou no main
    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {
            metodo2();
        } catch (ArithmeticException exception){
            System.out.println(exception.getMessage()); //apenas o motivo do erro
            System.out.println("ArithmeticException | ERRO: " + exception); //exception - apresenta o erro completo - classe + mensagem
            exception.printStackTrace(); //mostra em qual método foi passado e não conseguiu resolver
        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = i / 0;
        }
        System.out.println("Fim do metodo2");
    }
}