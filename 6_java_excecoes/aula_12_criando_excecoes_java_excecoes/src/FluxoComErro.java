public class FluxoComErro {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
            //como foi criada a exceção - MinhaExcecao - pode ser passada como parametro para o try-catch
        } catch (ArithmeticException | NullPointerException | MinhaExcecaoException exception){
            System.out.println(exception.getMessage());
            System.out.println("Exception | ERRO: " + exception);
            exception.printStackTrace();
        }
        System.out.println("Fim do main");

        System.out.println("\nIsto foi uma PILHA de execução");
    }
    private static void metodo1() throws MinhaExcecaoException {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecaoException{
        System.out.println("chamando metodo2");
        throw new MinhaExcecaoException("ERRO! - Extendendo a classe Exception");
    }
}
