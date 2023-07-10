public class CriaConta {
    public static void main(String[] args) {
        ExConta conta1 = new ExConta();
        conta1.saldo = 10000;
        System.out.println(conta1.saldo);

        ExConta conta2 = new ExConta();
        conta2.saldo = 333;
        System.out.println(conta2.saldo);

        //conferindo referencia
        if(conta1 == conta2){
            System.out.println("As contas são iguais");
        } else{
            System.out.println("As contas são diferentes");
        }

        System.out.println(conta1);
        System.out.println(conta2);
    }
}
