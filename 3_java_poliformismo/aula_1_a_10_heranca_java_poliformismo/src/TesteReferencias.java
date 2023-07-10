public class TesteReferencias {
    public static void main(String[] args) {
        //PODE SER FEITO DESTE MODO
        //funciona todos os métodos da classe GERENTE
        Gerente gerente1 = new Gerente();
        gerente1.setNome("Vinícius");
        gerente1.setSalario(5300.00);
        String nome1 = gerente1.getNome();
        double salario1 = gerente1.getSalario();
        System.out.println("Nome: " + nome1 + " | Salário: " + salario1);

        //COMO TODO GERENTE, "DERIVA" DA CLASSE FUNCIONÁRIO, PODE SER INICIALIZADO ASSIM (gerente é um funcionário - classe extendida)
        Funcionario gerente2 = new Gerente();
        gerente2.setNome("Vinícius P. S.");
        gerente2.setSalario(6910.00);
        String nome2 = gerente2.getNome();
        double salario2 = gerente2.getSalario();
        System.out.println("Nome: " + nome2 + " | Salário: " + salario2);
        //funicona apenas os métodos da classe FUNCIONÁRIO, mesmo usando o construtor GERENTE
        /*gerente2.verificaSenha(2410);*/

        //MAS NÃO PODE SER INICIALIZADO ASSIM
        /*Gerente gerente3 = new Funcionario();*/

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Vinícius P.");
        funcionario1.setSalario(2310.00);
        String nome3 = funcionario1.getNome();
        double salario3 = funcionario1.getSalario();
        System.out.println("Nome: " + nome3 + " | Salário: " + salario3);

        //somando as bonifiações - todos os funcionários que estiverem abaixo
        ControleBonifiacao cb = new ControleBonifiacao();
        cb.registraBonificacao(gerente1); //total = 6095
        cb.registraBonificacao(gerente2); //total = 7946.5
        cb.registraBonificacao(funcionario1); //total = 346.5
        System.out.println(cb.getSoma());
    }
}
