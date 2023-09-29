package org.example.entities;

import javax.persistence.*;

@Entity /*representar que é uma entidade e tem uma tabela no DB representando*/
@Table(name = "professions") /*referenciando tabela com o nome "Peoples"*/
public class ProfessionEntity {

    @Id /*para informar ao DB que é um ID*/
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*para informar ao DB que ele quem irá controlar o ID*/
    private Long id;
    private String name;

    public ProfessionEntity(){

    }

    public ProfessionEntity(String nome) {
        this.name = nome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
