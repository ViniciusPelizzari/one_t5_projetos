package org.example.dao;

import org.example.Aula06ConnectionFactore;
import org.example.modelo.Aula15Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//DAO - Data Acess Object
public class Aula16ProdutoDAO {

    private static Connection connection;

    public Aula16ProdutoDAO(Connection connection){
        this.connection = connection;
    }

    public void salvarProduto(Aula15Produto produto) throws SQLException {
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
    }

    //AULA17
    public static List<Aula15Produto> listarProdutos() throws SQLException{
        List<Aula15Produto> produtos = new ArrayList<>();

        System.out.println("QUERY listar produto");

        String sql = "SELECT id, nome_produto_lv, descricao_produto_lv FROM produto_lv";

        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.execute();

            try (ResultSet resultSet = stmt.getResultSet()){
                while (resultSet.next()) {
                    Aula15Produto aula15Produto =
                            new Aula15Produto(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
                    produtos.add(aula15Produto);
                }
            }
        }
        return produtos;
    }
}
