import java.util.Scanner;

public class CadastroClientePJ {
    static Scanner s = new Scanner(System.in);
    ClientePJ x = new ClientePJ();
    Metodos m = new Metodos();
    public void RazaoSocial(){
        System.out.print("Razão Social: ");
        x.setRazaoSocial(s.next());
    }
    public void NomeFantasia(){
        System.out.print("Nome Fantasia: ");
        x.setNomeFantasia(s.next());
    }
    public void CNPJ(){
        System.out.print("CNPJ: ");
        x.setCnpj(s.next());
    }
    public void InscricaoEstadual(){
        System.out.print("Inscrição Estadual: ");
        x.setInscricaoEstadual(s.nextLong());
    }
    public void Observacao(){
        System.out.print("Observação: ");
        x.setObservacao(s.next());
    }
    public void Endereco(){
        System.out.print("CEP: ");
        x.getEndereco().setCep(s.nextInt());
        System.out.print("Rua: ");
        x.getEndereco().setRua(s.nextLine());
        System.out.print("Complemento: ");
        x.getEndereco().setComplemento(s.nextLine());
        System.out.print("Bairro: ");
        x.getEndereco().setBairro(s.nextLine());
        System.out.print("Número: ");
        x.getEndereco().setNumero(s.nextInt());
        System.out.print("Cidade: ");
        x.getEndereco().setCidade(s.nextLine());
        System.out.print("Estado: ");
        x.getEndereco().setEstado(s.nextLine());
        System.out.print("Código Ibge: ");
        x.getEndereco().setCodIbge(s.nextInt());
    }

    public void ImprimiDados(){
        m.Imprimir("Razão Social: " + x.getRazaoSocial());
        m.Imprimir("Nome Fantasia: " + x.getNomeFantasia());
        m.Imprimir("CNPJ: " + x.getCnpj());
        m.Imprimir("Inscrição Estadual: " + x.getInscricaoEstadual());
        m.Imprimir("Observação: " + x.getObservacao());
        m.Imprimir("CEP: " + x.getEndereco().getCep());
        m.Imprimir("Rua: " + x.getEndereco().getRua());
        m.Imprimir("Complemento: " + x.getEndereco().getComplemento());
        m.Imprimir("Bairro: " + x.getEndereco().getBairro());
        m.Imprimir("Número: " + x.getEndereco().getNumero());
        m.Imprimir("Cidade: " + x.getEndereco().getCidade());
        m.Imprimir("Estado: " + x.getEndereco().getEstado());
        m.Imprimir("Código Ibge: " + x.getEndereco().getCodIbge());
    }
}
