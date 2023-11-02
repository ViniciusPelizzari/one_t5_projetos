package org.example.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

/*MAPEAMENTO DE ENTIDADE*/
@Entity /*representar que é uma entidade e tem uma tabela no DB representando*/
@Table(name = "products") /*referenciando tabela com o nome "Peoples"*/
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) /*indica que os dados das classes filhas que extendem está classe serão armazenadas nesta tabela*/

//melhor deixar na DAO
//@NamedQuery(name = "ProductEntity.productsByName", query = "SELECT p FROM productEntity p WHERE p.name = :nome") /*pode ser passado a consulta sql aqui ao invés de estar na DAO*/
public class ProductEntity {

    @Id /*para informar ao DB que é um ID*/
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*para informar ao DB que ele quem irá controlar o ID*/
    private Integer id;
    private String name;
    private BigDecimal price;
    private String description;
    private LocalDate registrationDate = LocalDate.now();
    @ManyToOne(fetch = FetchType.LAZY)
    private CategoryEntity categoryEntity;

    public ProductEntity() {

    }

    public ProductEntity(String name, BigDecimal price, String description, CategoryEntity categoryEntity) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.categoryEntity = categoryEntity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

    @Override
    public String toString() {
        return "productEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", registrationDate=" + registrationDate +
                ", categoryEntity=" + categoryEntity +
                '}';
    }
}
