public class ConexaoConst {

    public ConexaoConst(){
        System.out.println("Abrindo conexão");
    }

    public void LerDados(){
        System.out.println("Lendo dados");

        //para quando quiser dizer que o objeto que está usando tem um estado inconsistente
        throw new IllegalStateException();
    }

    public void Fecha(){
        System.out.println("Fechando conexao");
    }
}
