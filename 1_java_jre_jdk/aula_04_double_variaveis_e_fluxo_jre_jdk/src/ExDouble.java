public class ExDouble {
    public static void main(String[] args) {
        double salario = 1500.00;
        System.out.println("Meu salário atual é de R$" + salario + " bruto");
        salario = salario - (salario * 0.12);
        System.out.println("Meu salário atual é de R$" + salario + " liquído");
        System.out.println("Ainda bem que tudo é fase!");
    }
}
