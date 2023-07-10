public class TestaGettersSetters {
    public static void main(String[] args) {
        Conta conta= new Conta(33, 25);
        System.out.println(conta.getNumero());
        conta.setNumero(33);
        conta.setAgencia(520);
        System.out.println(conta.getAgencia());

        conta.depositar(101010);
        conta.sacar(202);
        System.out.println(conta.getSaldo());

        Cliente benicio = new Cliente();
        benicio.setNome("Benício Pelizzari da Silva");
        conta.setTitular(benicio);
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setNome("Benício B. Pelizzari da Silva");
        System.out.println(conta.getTitular().getNome());

        System.out.println();

        conta.getTitular().getEndereco().setBairro("Centro");
        System.out.println(conta);
        System.out.println(conta.getTitular());
        System.out.println(conta.getTitular().getEndereco());
        System.out.println(conta.getTitular().getEndereco().getBairro());

        conta.getTitular().setCpf("1234");
        System.out.println(conta.getTitular().getCpf());

        conta.getTitular().setProfissao("Desenvolvedor");
        System.out.println(conta.getTitular().getProfissao());
    }
}
