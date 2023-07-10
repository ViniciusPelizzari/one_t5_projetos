public class TestaClasses {
    public static void main(String[] args) {
        Cliente benicio = new Cliente();
        benicio.nome = "Benício Pelizzari da Silva";
        benicio.cpf = "111.111.111-11";
        benicio.profissao = "Bebê";
        benicio.endereco.bairro = "Centro";
        benicio.endereco.cep = 85790000;
        benicio.endereco.cidade = "Capitão Leônidas Marques";
        benicio.endereco.rua = "Avenida Tancredo Neves";
        benicio.endereco.estado = "PR";
        benicio.endereco.complemento = "Esquina";
        benicio.endereco.numero = 629;

        //associando cliente a conta
        Conta cBenicio = new Conta();
        cBenicio.agencia = 333;
        cBenicio.conta = 3333;
        cBenicio.titular = benicio;
        System.out.println(cBenicio.titular.nome);
        cBenicio.depositar(101010.10);
    }
}
