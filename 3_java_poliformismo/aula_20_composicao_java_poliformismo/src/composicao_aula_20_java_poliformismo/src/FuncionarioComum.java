//gerente herda da classe funcionario
public class FuncionarioComum extends Funcionario {

    public double getBonificacao(){
        return this.getSalario() * 0.15;
    }
}

