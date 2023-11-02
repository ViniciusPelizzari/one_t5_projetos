package org.example;

import java.sql.*;

//codigo aula 05
public class Aula05Listagem {
    public static void main(String[] args) throws SQLException {

        //implementação da aula 06
        Aula06ConnectionFactore aula06ConnectionFactore = new Aula06ConnectionFactore();
        Connection connection = aula06ConnectionFactore.criaConexao();

        /*Statement stmt = connection.createStatement();
        boolean resultado = stmt.execute("SELECT * FROM produto_lv");*/
        //ATUALIZANDO CÓDIGO
        PreparedStatement stmt = connection.prepareStatement("SELECT * FROM produto_lv");

        boolean resultado = stmt.execute();
        System.out.println(resultado);
        ResultSet resultSet = stmt.getResultSet();

        System.out.println("ID - Nome - Descrição");
        while (resultSet.next()){
            Integer id = resultSet.getInt("id");
            System.out.print(id + " - ");
            String nome = resultSet.getNString("nome_produto_lv");
            System.out.print(nome + " - ");
            String descricao = resultSet.getNString("descricao_produto_lv");
            System.out.print(descricao);
            System.out.println();
        }

        connection.close();
        System.out.println("DATABASE DISCONNECTED");
    }
}
