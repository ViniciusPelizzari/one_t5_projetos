package org.example;

import java.sql.*;

public class Aula10e11InsercaoComDiversosParametrosCommitManual {
    public static void main(String[] args) throws SQLException {

        Aula06ConnectionFactore aula06ConnectionFactore = new Aula06ConnectionFactore();
        Connection connection = aula06ConnectionFactore.criaConexao();

        connection.setAutoCommit(false); //comando para informar ao JDBC que o autocommit é falso e o desenvolvedor está no controle
        //não há mais nenhuma inserção automatica dos produtos por causa do FALSE no autocommit

        PreparedStatement stmt = connection.prepareStatement("INSERT INTO produto_lv (nome_produto_lv, descricao_produto_lv) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);

        inserirDados("Postman", "Ferramenta de teste", stmt);
        inserirDados("VOSTRO DELL", "Notebook para trabalho/estudo", stmt);

        connection.commit(); //fazendo o COMMIT MANUAL

        stmt.close();
        connection.close();
    }

    public static void inserirDados(String nome, String descricao, PreparedStatement stmt) throws SQLException {
        stmt.setString(1, nome);
        stmt.setString(2, descricao);

        /*if(nome.equals("Postman") || nome.equals("VOSTRO DELL")){
            throw new RuntimeException("Produtos já cadastrados!");
        }*/

        stmt.execute();

        ResultSet resultSet = stmt.getGeneratedKeys();
        while (resultSet.next()) {
            Integer id = resultSet.getInt(1);
            System.out.println("ID criado = " + id);
        }

        resultSet.close();
    }
}
