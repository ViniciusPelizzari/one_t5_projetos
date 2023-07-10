public class Cliente implements Autenticacao {
    private VerificaoSenhas verifica;

    public Cliente(){
        this.verifica = new VerificaoSenhas();
    }

    //métodos que estão sendo implementados pela interface
    @Override
    public boolean verificaSenha(int senha) {
        boolean verificou = this.verifica.verificaSenha(senha);
        return verificou;
    }

    @Override
    public void setSenha(int senha) {
        this.verifica.setSenha(senha);
    }
}

