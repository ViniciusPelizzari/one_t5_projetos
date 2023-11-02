package org.example;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

//codigo aula 06
public class Aula06ConnectionFactore {

    //POOL DE CONEXÃO - aula 13
    public DataSource dataSource; //variável dataSource
    public Aula06ConnectionFactore(){
        //Instanciando Pool e DataSource
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        //Setando URL JDBC, user e password
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC");
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("20032006");

        //aula 14
        comboPooledDataSource.setMaxPoolSize(15);

        //passando os parâmetros do COMBOPOOLEDDATASURCE para a variável dataSource -> ela irá "expor" a conexão para todo o código
        this.dataSource = comboPooledDataSource;
    }

    public Connection criaConexao() throws SQLException {
        System.out.println("DATABASE CONNECTED!");
        //retornando a conexão
        return this.dataSource.getConnection();
    }

    //código aula 6
    /*public Connection criaConexao() throws SQLException {
        System.out.println("DATABASE CONNECTED!");
        return DriverManager.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=" +
                "true&serverTimezone=UTC", "root", "20032006");
    }*/
}
