public class TesteReferencias {
    public static void main(String[] args) {
        //PODE SER FEITO DESTE MODO
        //funciona todos os métodos da classe GERENTE
        Gerente gerente1 = new Gerente();
        gerente1.setNome("Vinícius");
        gerente1.setSalario(5300.00);
        String nome1 = gerente1.getNome();
        double salario1 = gerente1.getSalario();
        gerente1.imprimir("Nome: " + nome1 + " | Salário: " + salario1);

        //COMO TODO GERENTE, "DERIVA" DA CLASSE FUNCIONÁRIO, PODE SER INICIALIZADO ASSIM (gerente é um funcionário - classe extendida)
        Funcionario desenvolvedor1 = new Desenvolvedor();
        desenvolvedor1.setNome("Vinícius P. S.");
        desenvolvedor1.setSalario(6910.00);
        String nome2 = desenvolvedor1.getNome();
        double salario2 = desenvolvedor1.getSalario();
        desenvolvedor1.imprimir("Nome: " + nome2 + " | Salário: " + salario2);
        //funicona apenas os métodos da classe FUNCIONÁRIO, mesmo usando o construtor GERENTE
        /*desenvolvedor1.verificaSenha(2410);*/

        //MAS NÃO PODE SER INICIALIZADO ASSIM
        /*Gerente gerente3 = new Funcionario();*/

        /*Funcionario funcionario1 = new Funcionario();*/
        //ao usar o ABSTRACT, não é possível usar o construtor FUNCIONARIO(). Ex: Funcionario f = new Funcionario();
        //Uma classe abstrata é uma classe que não pode ser instanciada diretamente, ou seja, você não pode criar objetos dessa classe
        Funcionario funcionario1 = new FuncionarioComum();
        funcionario1.setNome("Vinícius P.");
        funcionario1.setSalario(2310.00);
        String nome3 = funcionario1.getNome();
        double salario3 = funcionario1.getSalario();
        funcionario1.imprimir("Nome: " + nome3 + " | Salário: " + salario3);

        //somando as bonifiações - todos os funcionários que estiverem abaixo
        controleBonifiacao cb = new controleBonifiacao();
        cb.registraBonificacao(gerente1);
        cb.registraBonificacao(desenvolvedor1);
        cb.registraBonificacao(funcionario1);
        System.out.println(cb.getSoma());
    }
}
