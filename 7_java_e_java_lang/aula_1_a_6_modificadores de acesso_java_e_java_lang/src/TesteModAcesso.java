public class TesteModAcesso {
    static ModificadoresAcesso modificadoresAcesso = new ModificadoresAcesso();
    static String filho = modificadoresAcesso.protegido; //foi possível acessar pois foi instanciada a classe mãe
    //static String protecao = modificadoresAcesso.privado; //não é possível acessar por ela ser privada
    static String padronizado = modificadoresAcesso.padrao; //é possível acessar por estar dentro do mesmo pacote
    static String publica = modificadoresAcesso.publico; //é possível acessar por ela ser pública
    public static void main(String[] args) {
        System.out.println(filho);
        //System.out.println(protecao);
        System.out.println(padronizado);
        System.out.println(publica);
    }
}