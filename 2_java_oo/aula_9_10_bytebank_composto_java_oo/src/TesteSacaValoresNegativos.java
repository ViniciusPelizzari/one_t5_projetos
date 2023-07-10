public class TesteSacaValoresNegativos {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(100);
        conta.sacar(133);
        System.out.println(conta.informaSaldo());

        //erro após privar a variável saldo
        /*//"pedindo por favor" - acessando métodos
        conta.sacar(133);
        System.out.println(conta.saldo);

        //diretamente no atributo
        conta.saldo = conta.saldo - 133;
        System.out.println(conta.saldo);*/
    }
}
