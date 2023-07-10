//gerente herda da classe funcionario
public class Gerente extends Funcionario implements Autenticacao {
    private VerificaoSenhas verifica;

    public double getBonificacao(){
        //após colocar a variável como protected, é possível acessa-lá dentro das classes herdeiras da classe em que a variável esteja presente
        //é utilizad o super, para saber que é necessário "subir", acessar a classe mãe, para encontrar a variável
        //return (this.salario * 0.15) + super.salario;
        return this.getSalario() + (this.getSalario() * 0.15);
        //caso seja alterado algo na classe mãe, usando o super, pode-se chamar também os métodos, o que facilita as alterações -  ao invés de chamar (this.salario * 0.15) que corresponde ao que está dentro do método na classe mãe, chama-se o método completo
    }

    public Gerente(){
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

