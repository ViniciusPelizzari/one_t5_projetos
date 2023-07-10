public class VerificaoSenhas {

    private int senha;

    public boolean verificaSenha(int senha) {
        if(this.senha == senha){
            return true;
        } else{
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
