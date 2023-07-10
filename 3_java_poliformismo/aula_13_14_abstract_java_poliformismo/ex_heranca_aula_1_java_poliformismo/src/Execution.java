public class Execution {

    public static void main(String[] args) {
        Funcionario v = new Funcionario();
        v.setNome("Vinícius Pelizzari da Silva");
        v.setCpf("111.111.111-11");
        v.setCargo("Desenvolvedor Java Junior");
        v.setSalario(3500.33);
        v.getEndereco().setRua("Rua do Aprendiazado");
        v.getEndereco().setBairro("Conhecimento");
        v.getEndereco().setComplemento("Estudando sempre");
        v.getEndereco().setNumero(333);
        v.getEndereco().setEstado("PR");
        v.getEndereco().setCidade("Capitão Lêonidas Marques");
        v.getEndereco().setCep(85790000);

        v.imprimir("Nome: " + v.getNome() + " | CPF: " + v.getCpf());
        v.imprimir("Cargo: " + v.getCargo() + " | Salario: " + v.getSalario() + " | Bonificação: " + v.getBonificacao());
        v.imprimir("Rua: " + v.getEndereco().getRua() + " | Bairro: " + v.getEndereco().getBairro());
        v.imprimir("Complemento: " + v.getEndereco().getComplemento() + " | Número: " + v.getEndereco().getNumero());
        v.imprimir("CEP: " + v.getEndereco().getCep() + " | Cidade: " + v.getEndereco().getCidade() + " | Estado: " + v.getEndereco().getEstado());

        //-/-/-/-/-/-/-/-/-/-/-/-/-/
        System.out.println();

        FuncionarioTeste ft = new FuncionarioTeste();
        ft.setNome("Funcionário comum");
        ft.setSalario(3562.63);

        v.imprimir("Nome: " + ft.getNome() + " | Salario: " + ft.getSalario() + " | Bonificação: " + ft.getBonificacao(0));

        //-/-/-/-/-/-/-/-/-/-/-/-/-/
        System.out.println();

        FuncionarioTeste gerente = new FuncionarioTeste();
        gerente.setNome("Gerente");
        gerente.setSalario(3562.63);

        v.imprimir("Nome: " + gerente.getNome() + " | Salario: " + gerente.getSalario() + " | Bonificação: " + gerente.getBonificacao(1));
    }
}
