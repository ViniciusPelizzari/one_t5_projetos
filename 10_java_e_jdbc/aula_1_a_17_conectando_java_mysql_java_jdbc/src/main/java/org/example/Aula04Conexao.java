package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//codigo aula 04
public class Aula04Conexao {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=" +
                                                            "true&serverTimezone=UTC", "root", "20032006");

        System.out.println("DATABASE CONNECTED");

        connection.close();
        System.out.println("DATABASE DISCONNECTED");
    }
}