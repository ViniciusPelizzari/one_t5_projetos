public class Cliente implements Autenticacao {
    //métodos que estão sendo implementados pela interface
    private int senha;

    @Override
    public boolean verificaSenha(int senha) {
        if(this.senha == senha){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }
}

