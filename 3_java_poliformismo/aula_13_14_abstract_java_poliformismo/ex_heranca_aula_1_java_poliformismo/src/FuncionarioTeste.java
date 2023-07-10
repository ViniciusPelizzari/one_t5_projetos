public class FuncionarioTeste {

    private String nome;
    private String cpf;
    private String cargo;
    private double salario;
    private Endereco endereco = new Endereco();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public double getBonificacao(int tipo){ //0 = funcionário comum | 1 - gerente
        if(tipo == 0){
            return this.salario*0.15;
        } else if(tipo == 1){
            return this.salario;
        }
        return 0;
    }

    public static void imprimir(String frase){
        System.out.println(frase);
    }
}
