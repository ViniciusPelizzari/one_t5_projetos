package org.example.modelo;


import org.example.Aula06ConnectionFactore;
import org.example.dao.Aula16ProdutoDAO;
import org.example.dao.Aula18CategoriaDAOAula19InnerJoin;

import java.sql.*;
import java.util.List;

public class Aula15Insercao {
    public static void main(String[] args) throws SQLException {
        //AULA15
        /*Aula15Produto mesa = new Aula15Produto("Mesa", "Mesa de estudos programação");
        mesa.InserirProdutos(mesa);

        Aula15Produto fone = new Aula15Produto("Fones de Ouvido", "Mesa de estudos programação");
        fone.InserirProdutos(fone);*/

        //AULA16
        Aula15Produto fone = new Aula15Produto("Fones de Ouvido", "Mesa de estudos programação");
        try (Connection connection = new Aula06ConnectionFactore().criaConexao()){
            //new Aula16PersistenciaProduto(connection).salvarProduto(fone);

            Aula16ProdutoDAO produtoDAO = new Aula16ProdutoDAO(connection);
            produtoDAO.salvarProduto(fone);

            //AULA17
            List<Aula15Produto> listaProdutos = Aula16ProdutoDAO.listarProdutos();
            listaProdutos.stream().forEach(lp -> System.out.println(lp));

            System.out.println();

            Aula18CategoriaDAOAula19InnerJoin categoriaDAO = new Aula18CategoriaDAOAula19InnerJoin(connection);
            List<Aula18Categoria> listaCategorias = categoriaDAO./*listarCategorias()*/listarCategoriasComProdutos();
            listaCategorias.stream().forEach(ct -> {
                System.out.println(ct.getNome());
                for(Aula15Produto produto : ct.getAula15Produtos()){
                    System.out.println(ct.getNome() + " - " + produto.getNome());
                }
            });
        }
    }
}
