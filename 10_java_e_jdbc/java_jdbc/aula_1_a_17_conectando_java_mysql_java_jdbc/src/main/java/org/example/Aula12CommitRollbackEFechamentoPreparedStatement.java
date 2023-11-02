package org.example;

import java.sql.*;

public class Aula12CommitRollbackEFechamentoPreparedStatement {
    public static void main(String[] args) throws SQLException {

        //como os STATEMENTS estendem o AUTOCLOSEABLE, o try-with-resources executa o método CLOSE sem que precise estar explícito

        Aula06ConnectionFactore aula06ConnectionFactore = new Aula06ConnectionFactore();
        try (Connection connection = aula06ConnectionFactore.criaConexao()) {
        //foi colocado o Connection dentro dos parenteses do TRY, assim não é necessário fazer o fechamento do CONNECTION, pois será fechado ao sair do try

            connection.setAutoCommit(false); //desativando autocommit

            try (PreparedStatement stmt = connection.prepareStatement("INSERT INTO produto_lv (nome_produto_lv, descricao_produto_lv) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS)) {
                //foi colocado o PreparedStatement dentro dos parenteses do TRY, assim não é necessário fazer o fechamento do STMT, pois será fechado ao sair do try

                inserirDados("Git", "Versionamento", stmt);

                connection.commit(); //fazendo o COMMIT MANUAL

                connection.close();
            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println("ROLLBACK foi executado"); //rollback é uma operação que desfaz todas as alterações feitas por uma transação e retorna as variáveis ao seu estado anterior
                connection.rollback(); //executando rollback
            }
        }
    }

    public static void inserirDados(String nome, String descricao, PreparedStatement stmt) throws SQLException {
        stmt.setString(1, nome);
        stmt.setString(2, descricao);

        if(nome.equals("Postman") || nome.equals("VOSTRO DELL")){
            throw new RuntimeException("Produtos já cadastrados!");
        }

        stmt.execute();

        try (ResultSet resultSet = stmt.getGeneratedKeys()){
            //foi colocado o ResultSet dentro dos parenteses do TRY, assim não é necessário fazer o fechamento do RESULTSET, pois será fechado ao sair do try
            while (resultSet.next()) {
                Integer id = resultSet.getInt(1);
                System.out.println("ID criado = " + id);
            }
        }
    }
}
