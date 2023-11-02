package org.example;

import java.sql.*;

//codigo aula 07
public class Aula07Insercao {

    public static void main(String[] args) throws SQLException {

        Aula06ConnectionFactore aula06ConnectionFactore = new Aula06ConnectionFactore();
        Connection connection = aula06ConnectionFactore.criaConexao();

        String nome = "Postman'";
        String descricao = "Ferramenta de teste";

        /*Statement stmt = connection.createStatement();
        boolean resultado = stmt.execute("INSERT INTO produto_lv (nome_produto_lv, descricao_produto_lv) VALUES ('Postman', 'Ferramenta de teste');", Statement.RETURN_GENERATED_KEYS);*/
        //ATUALIZANDO CÓDIGO
        PreparedStatement stmt = connection.prepareStatement("INSERT INTO produto_lv (nome_produto_lv, descricao_produto_lv) VALUES (?, ?);", Statement.RETURN_GENERATED_KEYS);

        stmt.setString(1, nome);
        stmt.setString(2, descricao);

        boolean resultado = stmt.execute();

        ResultSet resultSet = stmt.getGeneratedKeys();
        while (resultSet.next()){
            Integer id = resultSet.getInt(1);
            System.out.println("ID criado = " + id);
        }
        System.out.println(resultado);
    }
}
