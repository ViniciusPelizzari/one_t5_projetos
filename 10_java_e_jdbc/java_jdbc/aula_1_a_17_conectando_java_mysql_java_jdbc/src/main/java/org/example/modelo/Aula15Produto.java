package org.example.modelo;

import org.example.Aula06ConnectionFactore;

import java.sql.*;

public class Aula15Produto {

    private Integer id;
    private String nome;
    private String descricao;

    public Aula15Produto(){

    }

    public Aula15Produto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public Aula15Produto(Integer id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /*@Override
    public String toString() {
        "Aula15Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }*/

    @Override
    public String toString() {
        return String.format("Produto:  %d, %s, %s", this.getId(), this.getNome(), this.getDescricao());
    }

    //AULA 15
    /*public static void InserirProdutos(Aula15Produto produto) throws SQLException{
        try (Connection connection = new Aula06ConnectionFactore().criaConexao()){
            String sql = "INSERT INTO produto_lv (nome_produto_lv, descricao_produto_lv) VALUES (?, ?)";

            try (PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
                stmt.setString(1, produto.getNome());
                stmt.setString(2, produto.getDescricao());

                stmt.execute();

                try (ResultSet resultSet = stmt.getGeneratedKeys()){
                    while (resultSet.next()) {
                        produto.setId(resultSet.getInt(1));
                        System.out.println("ID criado = " + produto.getId());
                    }
                }
            }
        }

        System.out.println(produto.toString());
    }*/
}
