public class Try2CatchNullP { //O bloco try apenas delimita a área na qual uma exceção pode ser lançada. É através do bloco catch que lidamos com a exceção capturada dentro de um bloco try.
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");

        System.out.println("\nIsto foi uma PILHA de execução");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {
            metodo2();
        } catch (NullPointerException | ArithmeticException exception){ //pode ser colocado mais de uma exceção dentro do CATCH, ao invés de extender muito o código
            System.out.println(exception.getMessage()); //apenas o motivo do erro
            System.out.println("Exception | ERRO: " + exception); //exception - apresenta o erro completo - classe + mensagem
            exception.printStackTrace(); //mostra em qual método foi passado e não conseguiu resolver
        } /*catch (NullPointerException exception){
            System.out.println(exception.getMessage()); //apenas o motivo do erro
            System.out.println("NullPointerException | ERRO: " + exception); //exception - apresenta o erro completo - classe + mensagem
            exception.printStackTrace(); //mostra em qual método foi passado e não conseguiu resolver
        } catch (ArithmeticException exception){
            System.out.println(exception.getMessage()); //apenas o motivo do erro
            System.out.println("ArithmeticException | ERRO: " + exception); //exception - apresenta o erro completo - classe + mensagem
            exception.printStackTrace(); //mostra em qual método foi passado e não conseguiu resolver
        }*/
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            ContaCorrente cc = null;
            cc.sacar(100);
        }
        System.out.println("Fim do metodo2");
    }
}