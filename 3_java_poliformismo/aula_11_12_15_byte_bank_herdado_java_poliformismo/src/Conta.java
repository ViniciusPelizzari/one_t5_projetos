public abstract class Conta {
    private Cliente titular;
    private int agencia;
    private int numero;
    protected double saldo;

    //STATIC = está dizendo que é de toda a classe conta, não apenas de uma determinada conta
    private static int total;

    public Conta(int agencia, int numero){
        total++;
        System.out.println("Total de contas: " + total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Criação da conta: " + numero + " | Agência: " + agencia);
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Agência não pode ser 0 nem negativa!");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0){
            System.out.println("Número da conta não pode ser 0 nem negativa!");
            return;
        }
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }

    /*public void depositar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Saldo:" + this.saldo);
    }*/

    public abstract void depositar(double valor);

    public boolean sacar(double valor){
        if(this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Valor sacado: " + valor);
            return true;
        } else{
            return false;
        }
    }

    public boolean verificaSaque(boolean verifica){
        if(verifica){
            System.out.println("Saldo:" + this.saldo);
        } else{
            System.out.println("Saldo insuficiente!");
        }
        return true;
    }

    public boolean transferir(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        } else{
            return false;
        }
    }

    public boolean verificaTransferencia(boolean verifica){
        if(verifica){
            System.out.println("Saldo atual: " + this.saldo);
        } else{
            System.out.println("Saldo insuficiente!");
        }
        return true;
    }
}