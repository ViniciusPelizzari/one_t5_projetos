//gerente herda da classe funcionario
public class Administrador extends Funcionario implements Autenticacao {
    private VerificaoSenhas verifica;

    public Administrador(){
        this.verifica = new VerificaoSenhas();
    }
    public double getBonificacao(){
        return 1000 + (this.getSalario() * 0.15);
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

