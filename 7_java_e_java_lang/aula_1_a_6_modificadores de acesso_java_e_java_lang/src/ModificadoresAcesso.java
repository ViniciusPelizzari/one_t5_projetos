public class ModificadoresAcesso {

    private static String privado = "privado";
    protected static String protegido = "protegido";
    static String padrao = "padrao";
    public static String publico = "pubico";

    public static void main(String[] args) {
        System.out.println(protegido);
        System.out.println(privado);
        System.out.println(padrao);
        System.out.println(publico);
    }

}
