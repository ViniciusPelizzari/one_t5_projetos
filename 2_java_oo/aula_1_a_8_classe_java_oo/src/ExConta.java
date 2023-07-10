public class ExConta {

    double saldo;
    int agencia;
    int numero;
    String titular;

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Saldo:" + this.saldo);
    }

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

    public boolean transferir(double valor, ExConta destino){
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