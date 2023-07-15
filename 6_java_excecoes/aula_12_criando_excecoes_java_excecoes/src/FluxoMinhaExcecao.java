public class FluxoMinhaExcecao {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
            //como foi criada a exceção - MinhaExcecao - pode ser passada como parametro para o try-catch
        } catch (ArithmeticException | NullPointerException | MinhaExcecaoRunTimeException exception){
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

        throw new MinhaExcecaoRunTimeException("ERRO! - Extendendo a classe RunTimeException");
        //não se executa nada após dar um throw (lançar) alguma exceção
        //System.out.println("Fim do metodo2");
    }
}
