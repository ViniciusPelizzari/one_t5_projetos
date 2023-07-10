public class Fatorial {
    public static void main(String[] args) {
        int i;
        int fatorial = 1;
        for(i = 1; i <11; i++){
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
    }
}
