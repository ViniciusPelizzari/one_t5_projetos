public class ControleBonifiacao {
    //atributo para somar bonificação
    private double soma;

    //pode ser usado para qualquer classe que é filha da classe FUNCIONÁRIO

    //soma todas as bonificações
    public void registraBonificacao(Funcionario funcionario){
        double bonificacao = funcionario.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    public double getSoma() {
        return soma;
    }
}
