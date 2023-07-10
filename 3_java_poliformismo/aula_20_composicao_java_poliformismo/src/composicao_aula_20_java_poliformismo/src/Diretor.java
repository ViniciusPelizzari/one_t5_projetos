//gerente herda da classe funcionario
public class Diretor extends Funcionario implements Autenticacao {

    private VerificaoSenhas verifica;

    public Diretor(){
        this.verifica = new VerificaoSenhas();
    }
    public double getBonificacao(){
        return this.getSalario() * 2.5;
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

