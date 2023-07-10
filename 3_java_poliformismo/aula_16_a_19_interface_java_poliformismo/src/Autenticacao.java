//Uma interface é uma coleção de métodos abstratos (sem implementação) e constantes.
//Ela define um contrato que uma classe deve seguir ao implementar essa interface. Em termos simples, uma interface especifica
// os métodos que uma classe concreta deve implementar.
public abstract interface Autenticacao {
    //interface não aceita nada concreto
    /*private int senha;*/ //por isso vai ser apagado

    //é deixado apenas a assinatura dos métodos
    public abstract void setSenha(int senha);
    /*public void setSenha(int senha) {
        this.senha = senha;
    }*/

    public abstract boolean verificaSenha(int senha);
    /*public boolean verificaSenha(int senha){
        if(this.senha == senha){
            return true;
        } else{
            return false;
        }
    }*/
}
//uma interface é uma "classe abstrata" com os "métodos abstratos", contendo todos os métodos que serão obrigatórios
//a implementação das classes que utilizarem a interface

//não existe multiplas heranças, mas existe, múltiplas interfaces. Ex: extends Funcionario implements Autenticacao, Funcionarios
