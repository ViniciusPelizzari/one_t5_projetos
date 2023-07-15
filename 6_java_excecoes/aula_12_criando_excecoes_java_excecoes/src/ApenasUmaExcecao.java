public class ApenasUmaExcecao {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (Exception exception){ //captura todas as excecoes que derivam desta classe - inclusive a MinhaExcecaoRunTimeException
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
    }
}
