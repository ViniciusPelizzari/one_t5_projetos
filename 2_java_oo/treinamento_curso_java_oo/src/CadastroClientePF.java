import java.util.Scanner;

public class CadastroClientePF {

    static Scanner s = new Scanner(System.in);
    ClientePF x = new ClientePF();
    Metodos m = new Metodos();
    public void Nome(){
        System.out.print("Nome: ");
        x.setNome(s.next());
    }
    public void Sobrenome(){
        System.out.print("Sobrenome: ");
        x.setSobrenome(s.next());
    }
    public void CPF(){
        System.out.print("CPF: ");
        x.setCpf(s.next());
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
        m.Imprimir("Nome: " + x.getNome());
        m.Imprimir("Sobrenome: " + x.getSobrenome());
        m.Imprimir("CPF: " + x.getCpf());
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
