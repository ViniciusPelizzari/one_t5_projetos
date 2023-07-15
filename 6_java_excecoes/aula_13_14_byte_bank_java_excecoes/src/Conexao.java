public class Conexao implements AutoCloseable{ //ao ser implementada esta classe - ele fornece um método que fecha automaticamente

    public Conexao(){
        System.out.println("Abrindo conexão");
        //throw new IllegalStateException();
    }

    public void LerDados(){
        System.out.println("Lendo dados");

        //para quando quiser dizer que o objeto que está usando tem um estado inconsistente
        throw new IllegalStateException();
    }

    public void Fecha(){
        System.out.println("Fechando conexao");
    }

    @Override
    public void close() { //método fecha
        System.out.println("Fechando conexao");
    }
}
