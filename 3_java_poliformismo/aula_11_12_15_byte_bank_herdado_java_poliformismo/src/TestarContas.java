public class TestarContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(33, 333);
        cc.depositar(1000.00);
        //estes métodos não existem nas CC e CP, apenas na CONTA... HERDEIRAS
        ContaPoupanca cp = new ContaPoupanca(22, 222);
        cp.depositar(20000.00);

        cc.transferir(100, cp);

        cc.sacar(300.00);

        System.out.println(cc.getSaldo());
    }
}
