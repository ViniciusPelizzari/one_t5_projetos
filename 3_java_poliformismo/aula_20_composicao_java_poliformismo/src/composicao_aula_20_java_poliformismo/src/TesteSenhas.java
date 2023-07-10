public class TesteSenhas {
    public static void main(String[] args) {
        //é possível colocar também os contratos que ele assina
        /*Autenticacao gerente = new Gerente();*/
        Gerente gerente = new Gerente();
        gerente.setSenha(159753);

        Administrador administrador = new Administrador();
        administrador.setSenha(456789);

        SistemaInterno si = new SistemaInterno();
        si.verificacao(gerente);
        si.verificacao(administrador);
    }
}
