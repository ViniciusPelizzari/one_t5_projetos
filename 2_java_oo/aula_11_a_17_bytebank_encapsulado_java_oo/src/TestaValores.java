public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(33, 333);

        //conta está inconsistente
        conta.setAgencia(-33);
        conta.setNumero(-333);
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());

        //verificando STATIC total contas
        Conta conta1 = new Conta(33, 333);
        Conta conta2 = new Conta(33, 333);
        System.out.println(Conta.getTotal());
    }
}
