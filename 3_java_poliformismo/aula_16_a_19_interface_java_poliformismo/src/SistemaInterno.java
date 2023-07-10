public class SistemaInterno {

    private int senha = 159753;
    public void verificacao(Autenticacao autenticacao){
        boolean autenticado = autenticacao.verificaSenha(this.senha);
        if(autenticado == true){
            System.out.println("Acesso permitido!");
        } else{
            System.out.println("Acesso negado!");
        }
    }
}

