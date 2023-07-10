import java.util.Scanner;

public class Metodos {
    static Scanner s = new Scanner(System.in);
    static Opcao x = new Opcao();
    public static void OpcaoCliente(){
        System.out.println("1 - PF | 2 - PJ");
        x.setOpcaoCliente(s.nextInt());
    }

    public static void OpcaoImprimir(){
        System.out.println("Imprimir dados? 'SIM' ou 'NÃO'");
        x.setOpcaoImprimir(s.nextLine());
    }

    public static void Imprimir(String frase){
        System.out.println(frase);
    }

    public void Exe(){
        CadastroClientePF pf = new CadastroClientePF();
        CadastroClientePJ pj = new CadastroClientePJ();
        OpcaoCliente();
        if(x.getOpcaoCliente() == 1){
            pf.Nome();
            pf.Sobrenome();
            pf.CPF();
            pf.Observacao();
            pf.Endereco();
            OpcaoImprimir();
            if(x.getOpcaoImprimir() == "SIM"){
                pf.ImprimiDados();
            }
        } else if(x.getOpcaoCliente() == 2){
            pj.RazaoSocial();
            pj.NomeFantasia();
            pj.CNPJ();
            pj.InscricaoEstadual();
            pj.Observacao();
            pj.Endereco();
            OpcaoImprimir();
            if(x.getOpcaoImprimir() == "SIM"){
                pj.ImprimiDados();
            }
        }
    }
}
