package org.example.modelo;

import java.util.ArrayList;
import java.util.List;

public class Aula18Categoria {

    private Integer id;
    private String nome;

    //AULA19
    private List<Aula15Produto> aula15Produtos = new ArrayList<Aula15Produto>();

    public Aula18Categoria(){

    }

    public Aula18Categoria(String nome) {
        this.nome = nome;
    }

    public Aula18Categoria(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("Produto:  %d, %s", this.getId(), this.getNome());
    }

    public void adicionar(Aula15Produto aula15Produto) {
        aula15Produtos.add(aula15Produto);
    }

    public List<Aula15Produto> getAula15Produtos() {
        return aula15Produtos;
    }

    public void setAula15Produtos(List<Aula15Produto> aula15Produtos) {
        this.aula15Produtos = aula15Produtos;
    }
}
