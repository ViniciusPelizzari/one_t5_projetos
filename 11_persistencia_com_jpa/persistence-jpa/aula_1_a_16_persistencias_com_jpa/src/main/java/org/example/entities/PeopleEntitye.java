package org.example.entities;

import javax.persistence.*;
import java.time.LocalDate;

/*MAPEAMENTO DE ENTIDADE*/
@Entity /*representar que é uma entidade e tem uma tabela no DB representando*/
@Table(name = "peoples") /*referenciando tabela com o nome "Peoples"*/
public class PeopleEntitye {

    @Id /*para informar ao DB que é um ID*/
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*para informar ao DB que ele quem irá controlar o ID*/
    private Integer id;
    private String fullName;
    private Integer age;
    private String address;
    private String email;
    private Long phoneNumber;
    private LocalDate registrationDate = LocalDate.now();

    @ManyToOne /*muitos para um - uma única profissão pode estar relacionada a diversas pessoas*/
    /*relacionando a profissão as pessoas*/
    private ProfessionEntitye professionEntitye;
    //@Column(name = "remuneration"); /*alterando nome da coluna*/
    //private Float salary;
    //private Date dataBirth;
    //private Character gender;

    public PeopleEntitye() {

    }

    public PeopleEntitye(String fullName, Integer age, String address, String email, Long phoneNumber, ProfessionEntitye professionEntitye) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.professionEntitye = professionEntitye;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ProfessionEntitye getProfessionEntitye() {
        return professionEntitye;
    }

    public void setProfessionEntitye(ProfessionEntitye professionEntitye) {
        this.professionEntitye = professionEntitye;
    }

    @Override
    public String toString() {
        return "PeopleEntitye{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
