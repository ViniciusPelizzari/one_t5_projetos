public class LacosEncadeadosBreak {
    public static void main(String[] args) {
        int i;
        int j;
        for(i = 0; i <= 10; i++){
            for(j = 0; j <= i /*10*/; j++){
                /*if(j > i){
                    break;
                }
                */System.out.print("* ");
            }
            System.out.println();
        }
    }
}
