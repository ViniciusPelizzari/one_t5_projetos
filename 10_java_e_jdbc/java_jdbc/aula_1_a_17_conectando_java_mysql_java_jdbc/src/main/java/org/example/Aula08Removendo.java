package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Aula08Removendo {
    public static void main(String[] args) throws SQLException {

        Aula06ConnectionFactore aula06ConnectionFactore = new Aula06ConnectionFactore();
        Connection connection = aula06ConnectionFactore.criaConexao();

        int id_remove = 21;
        /*Statement stmt = connection.createStatement();
        boolean resultado = stmt.execute("DELETE FROM produto_lv WHERE id > 8");*/
        //ATUALIZANDO CÓDIGO
        PreparedStatement stmt = connection.prepareStatement("DELETE FROM produto_lv WHERE id > ?");

        stmt.setInt(1, id_remove);

        boolean resultado = stmt.execute();

        System.out.println(resultado);
        Integer linhasModificadas = stmt.getUpdateCount(); //.getUpdateCount() -> retorna quantas linhas foram modificadas
        System.out.println("Linhas modificadas = " + linhasModificadas);
    }
}
