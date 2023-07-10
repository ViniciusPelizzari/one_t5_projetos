public class TestaMétodos {
    public static void main(String[] args) {
        ExConta conta1 = new ExConta();

        conta1.saldo = 300;
        conta1.depositar(100.6);
        boolean verificaS = conta1.sacar(400.3);
        conta1.verificaSaque(verificaS);

        System.out.println();

        ExConta conta2= new ExConta();
        conta2.depositar(5301);
        boolean verificaT = conta2.transferir(33, conta1);
        conta2.verificaTransferencia(verificaT);
    }
}
