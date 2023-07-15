public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException exception){
            System.out.println(exception.getMessage());
            System.out.println("Exception | ERRO: " + exception);
            exception.printStackTrace();
        }
        System.out.println("Fim do main");

        System.out.println("\nIsto foi uma PILHA de execução");
    }
    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");

        //criando objeto da classe ArithmeticException
        /*ArithmeticException exception = new ArithmeticException("ERRO!"); //criando a mensagem da exceção
        throw exception; //throw = lançar - lançando a exceção*/

        //simplificando
        throw new ArithmeticException("ERRO!!");

        //não pode ter código abaixo do THROW - o Java não executa
        //System.out.println("Fim do metodo2");
    }
}