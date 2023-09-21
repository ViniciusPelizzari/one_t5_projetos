package org.example;

import java.sql.*;

public class Aula9InsercaoComParametro {

    public static void main(String[] args) throws SQLException {

        Aula06ConnectionFactore aula06ConnectionFactore = new Aula06ConnectionFactore();
        Connection connection = aula06ConnectionFactore.criaConexao();

        String nome = "Postman'";
        String descricao = "Ferramenta de teste); DELETE FROM produto_lv;";

        /*String sql = "INSERT INTO produto_lv (nome_produto_lv, descricao_produto_lv) VALUES ('" + nome + "','" + descricao + "');";

        Statement stmt = connection.prepareStatement(sql); //ao invés de deixar o connection.createStatement - coloca-se o prepareStatement,
        // que ele irá preparar e verificar o Statement (usado para o usuário não causar danos ao sistema ao inserir dados.
        // EX: String nome = "Postman'"; String descricao = "Ferramenta de teste); DELETE FROM produto_lv;";
        // - o usuário pode colocar CÓDIGOS MALICIOSOS ao inserir dados e prejudicar o sistema.
        // Por isto é aconselhável usar o prepareStatement() que ele irá preparar os dados que serão inseridos
        boolean resultado = stmt.execute(sql, Statement.RETURN_GENERATED_KEYS);*/

        PreparedStatement stmt = connection.prepareStatement("INSERT INTO produto_lv (nome_produto_lv, descricao_produto_lv) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);

        //pedindo para o stmt setar (método setter) uma String com a posição e o que será passado a ela
        stmt.setString(1, nome);
        stmt.setString(2, descricao);

        stmt.execute();

        ResultSet resultSet = stmt.getGeneratedKeys();
        while (resultSet.next()){
            Integer id = resultSet.getInt(1);
            System.out.println("ID criado = " + id);
        }
        //System.out.println(resultado);
    }
}
