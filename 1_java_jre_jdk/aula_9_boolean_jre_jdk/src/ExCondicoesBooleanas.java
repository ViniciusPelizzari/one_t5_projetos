public class ExCondicoesBooleanas {
    public static void main(String[] args) {
        double altura = 1.60;
        int acompanhantes = 2;
        boolean acompanhado = acompanhantes >= 2;
        if(acompanhado && altura <1.75 && altura >=1.40){
            System.out.println("Entrada permitida ao brinquedo!");
        } else{
            System.out.println("Não é permitido sua entrada ao brinquedo!");
        }
    }
}