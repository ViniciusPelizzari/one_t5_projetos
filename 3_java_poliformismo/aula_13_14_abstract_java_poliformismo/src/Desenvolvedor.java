//gerente herda da classe funcionario
public class Desenvolvedor extends Funcionario {

    public double getBonificacao(){
        return this.getSalario() * 0.15 + (this.getSalario() * 2);
    }
}
