package org.example;

public class ArrayObject {
    public static void main(String[] args) {
        Conta[] contas = new Conta[3]; //por ser genérica (instanciar a classe mãe) - é possível criarmos todas as opções que extende a classe mãe

        ContaCorrente cc1 = new ContaCorrente(3, 30);
        ContaPoupanca cp1 = new ContaPoupanca(2, 20);

        contas[0] = cc1;
        contas[1] = cp1;
        //ContaPoupanca ref = contas[0]; //para dar certo tem que avisar o compilador e fazer um cast - transformar - especificar o array contas
        ContaPoupanca ref = (ContaPoupanca) contas[1]; //se chama TYPE CAST
        System.out.println(ref.getNumero());

        ContaPoupanca[] contaPoupancas = new ContaPoupanca[2];
        ContaPoupanca cp2 = new ContaPoupanca(33, 3);
        contaPoupancas[0] = cp2;
        //contaPoupancas[1] = cc1; //já não é possível fazer a referenciação do objeto

        //se quisermos um array mais genérico - que recebe diferentes tipos de objetos (ex: Conta corrente, poupança, clientes...)
        //podemos fazer um array do tipo object
        Object[] contasObject = new Object[3];
        contasObject[0] = cc1;
        contasObject[1] = cp1;

        Cliente cliente = new Cliente();
        cliente.setNome("Vinícius");
        contasObject[2] = cliente; //array do tipo object recebe diversos tipos de objetos - diferentes dados
        Cliente refObject = (Cliente) contasObject[2]; //fazendo cast do objeto para cliente
        System.out.println(refObject.getNome());
    }

    /*ContaCorrente cc1 = new ContaCorrente(22, 33);
    Conta conta = cc1; //cast implicito */

    /*ContaCorrente cc1 = new ContaCorrente(22, 33);
    Conta conta = (Conta) cc1; //cast explícito mas desnecessário */
}