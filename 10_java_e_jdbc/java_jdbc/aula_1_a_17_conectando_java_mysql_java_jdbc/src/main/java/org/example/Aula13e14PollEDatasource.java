package org.example;

import java.sql.SQLException;

public class Aula13e14PollEDatasource {
    /*AULA 13*/
    //Pool de conexões - nome do pool C3P0
    // ****poderia ter sido instalado o arquivo .jar do C3P0, mas coloquei a dependência no POM.XML, por facilitar manutenção e ser mais rápido de fazer a instalação ****
    //Criando pool de conexão
    //Construtor da classe


    /*AULA 14*/
    //Setando tamanho máximo do pool

    //para ver o código desta aula, basta olhar o construtor da classe Aula06ConnectionFactore

    public static void main(String[] args) throws SQLException {

        Aula06ConnectionFactore aula06ConnectionFactore = new Aula06ConnectionFactore();

        for(int i = 0; i < 20; i++){
            aula06ConnectionFactore.criaConexao();
            System.out.println("Conexão de número: " + i);
        }
    }
}
