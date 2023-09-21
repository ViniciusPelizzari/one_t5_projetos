package org.example.dao;

import org.example.modelo.Aula18Categoria;
import org.example.modelo.Aula15Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Aula18CategoriaDAOAula19InnerJoin {

    private static Connection connection;

    public Aula18CategoriaDAOAula19InnerJoin(Connection connection){
        this.connection = connection;
    }

    //AULA17
    public static List<Aula18Categoria> listarCategorias() throws SQLException{
        List<Aula18Categoria> categorias = new ArrayList<>();

        String sql = "SELECT id_categoria, nome_categoria FROM categorias_produtos_lv";

        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.execute();

            try (ResultSet resultSet = stmt.getResultSet()){
                while (resultSet.next()) {
                    Aula18Categoria aula18Categoria =
                            new Aula18Categoria(resultSet.getInt(1), resultSet.getString(2));
                    categorias.add(aula18Categoria);
                }
            }
        }
        return categorias;
    }

    public List<Aula15Produto> buscar(Aula18Categoria ct) throws SQLException {
        List<Aula15Produto> produtos = new ArrayList<Aula15Produto>();

        System.out.println("QUERY listar categoria");

        String sql = "SELECT id, nome_produto_lv, descricao_produto_lv FROM produto_lv WHERE categoria_id = ?";

        try(PreparedStatement stmt = connection.prepareStatement(sql)){

            stmt.setInt(1, ct.getId());
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

    //AULA19
    public List<Aula18Categoria> listarCategoriasComProdutos() throws SQLException{
        Aula18Categoria ultima = null;

        List<Aula18Categoria> categorias = new ArrayList<>();

        System.out.println("QUERY listar categoria");

        String sql = "SELECT C.id_categoria, C.nome_categoria, P.id, P.nome_produto_lv, P.descricao_produto_lv  FROM categorias_produtos_lv C INNER JOIN" +
                " produto_lv P ON C.id_categoria = P.categoria_id";

        //comando = traz informações como ID e NOME da categoria com as informações ID, NOME e DESCRICAO dos produtos onde existir vinculo entre produto e categoria

        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.execute();

            try (ResultSet resultSet = stmt.getResultSet()){
                while (resultSet.next()) {
                    if (ultima == null || !ultima.getNome().equals(resultSet.getString(2))) {
                        Aula18Categoria aula18Categoria =
                                new Aula18Categoria(resultSet.getInt(1), resultSet.getString(2));
                        ultima = aula18Categoria;
                        categorias.add(aula18Categoria);
                    }
                    Aula15Produto aula15Produto = new Aula15Produto (resultSet.getInt(3), resultSet.getString(4), resultSet.getString(5));
                    ultima.adicionar(aula15Produto);                }
            }
        }
        return categorias;
    }
}
