public class LacosEncadeados {
    public static void main(String[] args) {
        int i;
        int j;
        for(i = 1; i <= 10; i++){
            for(j = 0; j <= 10; j++){
                System.out.print(i + " x " + j + " = " + i * j + " | ");
            }
            System.out.println();
        }
    }
}