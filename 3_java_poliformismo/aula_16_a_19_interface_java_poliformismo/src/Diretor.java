//gerente herda da classe funcionario
public class Diretor extends Funcionario implements Autenticacao{

    private int senha;

    public double getBonificacao(){
        return this.getSalario() * 2.5;
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

