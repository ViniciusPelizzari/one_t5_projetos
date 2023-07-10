public class ExReferenciacao {
    public static void main(String[] args) {
        //criado a 1º conta
        ExConta conta1 = new ExConta();
        //declarado um valor
        conta1.saldo = 333;
        System.out.println(conta1.saldo);

        //criando a 2º conta e referenciando a ela (atributos iguais)
        ExConta conta2 = conta1;
        System.out.println(conta2.saldo);

        //declarando valor adicional na 2º conta
        conta2.saldo +=33;
        System.out.println(conta2.saldo);
        //mas as duas saem iguais, por estarem sempre referenciads a um mesmo objeto, ao contrário da classe CriConta
        System.out.println(conta1.saldo);

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
