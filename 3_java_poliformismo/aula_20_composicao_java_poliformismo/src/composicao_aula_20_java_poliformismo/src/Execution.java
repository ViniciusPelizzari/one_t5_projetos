public class Execution {

    public static void main(String[] args) {
        /*Funcionario funcionario1 = new Funcionario();*/
        //ao usar o ABSTRACT, não é possível usar o construtor FUNCIONARIO(). Ex: Funcionario f = new Funcionario();
        //Uma classe abstrata é uma classe que não pode ser instanciada diretamente, ou seja, você não pode criar objetos dessa classe
        Funcionario v = new Gerente();
        v.setNome("Vinícius Pelizzari da Silva");
        v.setCpf("111.111.111-11");
        v.setCargo("Desenvolvedor Java Junior");
        v.setSalario(3333.33);
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

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

        Gerente gerente = new Gerente();
        gerente.setNome("Vinícius Pelizzari da Silva");
        gerente.setSalario(3333.33);

        gerente.setSenha(2410);
        boolean verificaSenha = gerente.verificaSenha(2410);
        gerente.imprimir(String.valueOf(verificaSenha));

        gerente.imprimir("Nome: " + gerente.getNome() + " | Salario: " + gerente.getSalario() + " | Bonificação: " + gerente.getBonificacao());
    }
}
