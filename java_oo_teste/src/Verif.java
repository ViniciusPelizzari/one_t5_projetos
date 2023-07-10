import java.util.Scanner;

public class Verif {
    public void Verificar(){
        aAndB ab = new aAndB();
        Scanner s = new Scanner(System.in);
        System.out.print("Valor de A: ");
        ab.setA(s.nextInt());
        System.out.print("Valor de B: ");
        ab.setB(s.nextInt());

        boolean divisor = ab.getA() % ab.getB() == 0;

        if(divisor){
            System.out.println(ab.getA() + " é divisível de " + ab.getB());
        } else {
            System.out.println(ab.getA() + " não é divisível de " + ab.getB());
        }
    }
}
