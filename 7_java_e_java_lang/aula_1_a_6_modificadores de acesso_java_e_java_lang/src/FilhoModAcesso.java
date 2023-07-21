public class FilhoModAcesso extends ModificadoresAcesso{
    static String filho = protegido; //é possível acessar esta variável, pois a classe extende a classe mãe, mas outras classes não tem acesso
    //static String protecao = privado; //não é possível acessar por ela ser privada
    static String padronizado = padrao; //é possível acessar por estar dentro do mesmo pacote
    static String publica = publico; //é possível acessar por ela ser pública
    public static void main(String[] args) {
        System.out.println(filho);
        //System.out.println(protecao);
        System.out.println(padronizado);
        System.out.println(publica);
    }
}
