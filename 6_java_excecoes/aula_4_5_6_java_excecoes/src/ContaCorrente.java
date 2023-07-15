public class ContaCorrente extends Conta{
    //Em uma herança, a classe filha herda os atributos e os métodos, mas NÃO herda os construtores
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override //utilizado para indicar que o método está sendo sobrescrito sobre  classe pai
    //esta anotação, não deixa o método ser modificado, em que o torne diferente da superclasse. Ex: torná-lo privado, ou modificá-lo para um double no lugar de boolean
    public boolean sacar(double valor) {
        double taxaSaque = 0.20;
        double valorSacado = valor + taxaSaque;
        return super.sacar(valorSacado);
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }
}
