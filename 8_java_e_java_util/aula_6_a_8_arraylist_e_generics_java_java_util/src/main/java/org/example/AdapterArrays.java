package org.example;

public class AdapterArrays {
    private Conta[] referencias; //criando array
    private int posicaoLivre;

    public AdapterArrays(){
        this.referencias = new Conta[5]; //criando construtor - inicializando array - passando tamanho do array
        this.posicaoLivre = 0; //inicializando variavel
    }

    public void adiciona(Conta conta){
        this.referencias[this.posicaoLivre] = conta;
        this.posicaoLivre++;
    }

    public int getQuantidadeElementos() {
        return this.posicaoLivre;
    }

    public Object getReferencias(int i) {
        return this.referencias[i];
    }
}