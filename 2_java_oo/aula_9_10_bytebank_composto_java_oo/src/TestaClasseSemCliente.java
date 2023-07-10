public class TestaClasseSemCliente {
    public static void main(String[] args) {
        Conta cKamila = new Conta();
        cKamila.titular = new Cliente();
        System.out.println(cKamila.titular);
        cKamila.titular.nome = "Kamila Pelizzari da Silva";
        System.out.println(cKamila.titular.nome);
    }
}

