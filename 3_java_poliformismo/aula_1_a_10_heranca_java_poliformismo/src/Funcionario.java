public class Funcionario {

    private String nome;
    private String cpf;
    private String cargo;

    //para acessar de uma classe herdeira, é necessário colocar como PROTECTED, pois private só dentro da classe e public prejudica a segurança
    //ou usa-se os getters e setters e acessa os valores por estes métodos
    //protected double salario;
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

    /*public double getBonificacao(double multiplicaSalarioBonificacao){
        return this.salario * multiplicaSalarioBonificacao;
    }*/

    public double getBonificacao(){
        return this.salario * 0.15;
    }

    public static void imprimir(String frase){
        System.out.println(frase);
    }
}
