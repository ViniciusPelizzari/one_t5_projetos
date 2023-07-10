public abstract class Funcionario {
    //não pode INSTANCIAR OBJETO desta classe por ser ABSTRATA
//ao usar o ABSTRACT, não é possível usar o construtor FUNCIONARIO(). Ex: Funcionario f = new Funcionario();
//Uma classe abstrata é uma classe que não pode ser instanciada diretamente, ou seja, você não pode criar objetos dessa classe
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

    /*public double getBonificacao(){
        return this.salario * 0.15;
    }*/
    //é o mesmo método acima, mas ele não tem nenhuma iplementação, por ser abstrato (abstrato pode ou não ter impleentação)
    //como este método está sendo usado nas outras classes filhas, é necessário ser existente este método, mas como não queremos que ele faça ou retorne nada, deixamo-o abstrato
    public abstract double getBonificacao();

    public static void imprimir(String frase){
        System.out.println(frase);
    }
}
