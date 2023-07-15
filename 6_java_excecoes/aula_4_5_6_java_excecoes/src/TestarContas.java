public class TestarContas {
    public static void main(String[] args) {

        ContaCorrente excecoes = null;
        excecoes.depositar(200);
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "ContaCorrente.depositar(double)" because "excecoes" is null
        //at TestarContas.main(TestarContas.java:5)

        //aconteceu uma EXCEÇÃO pois a conta excecoes que foi criado não existe, por ter valor null

        int a = 3;
        int b = a / 0;
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //at TestarContas.main(TestarContas.java:12)

        //aconteceu uma EXCEÇÃO pois não é possível dividir um valor por 0
    }
}
