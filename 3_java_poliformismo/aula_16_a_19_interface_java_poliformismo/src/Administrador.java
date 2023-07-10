//gerente herda da classe funcionario
public class Administrador extends Funcionario implements Autenticacao {

    private int senha;

    public double getBonificacao(){
        return 1000 + (this.getSalario() * 0.15);
    }

    //métodos que estão sendo implementados pela interface
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

