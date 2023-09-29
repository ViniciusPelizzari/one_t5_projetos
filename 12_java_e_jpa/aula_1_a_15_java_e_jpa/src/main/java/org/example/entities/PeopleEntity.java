package org.example.entities;

import javax.persistence.*;
import java.time.LocalDate;

/*MAPEAMENTO DE ENTIDADE*/
@Entity /*representar que é uma entidade e tem uma tabela no DB representando*/
@Table(name = "peoples") /*referenciando tabela com o nome "Peoples"*/
public class PeopleEntity {

    @Id /*para informar ao DB que é um ID*/
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*para informar ao DB que ele quem irá controlar o ID*/
    private Integer id;
    private String fullName;
    private Integer age;
    @Embedded /*embutindo a classe ADDRESS*/
    private Address address;
    private String email;
    private Long phoneNumber;
    private LocalDate registrationDate = LocalDate.now();

    @ManyToOne(fetch = FetchType.LAZY) /*muitos para um - uma única profissão pode estar relacionada a diversas pessoas*/
    /*relacionando a profissão as pessoas*/
    private ProfessionEntity professionEntity;
    //@Column(name = "remuneration"); /*alterando nome da coluna*/
    //private Float salary;
    //private Date dataBirth;
    //private Character gender;

    public PeopleEntity() {

    }

    public PeopleEntity(String fullName, Integer age, String publicPlace, Integer number, String complement, String city, String state, Long cep, String email, Long phoneNumber, ProfessionEntity professionEntity) {
        this.fullName = fullName;
        this.age = age;
        this.address = new Address(publicPlace, number, complement, city, state, cep);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.professionEntity = professionEntity;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
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

    public ProfessionEntity getProfessionEntitye() {
        return professionEntity;
    }

    public void setProfessionEntitye(ProfessionEntity professionEntity) {
        this.professionEntity = professionEntity;
    }

    public String getPublicPlace() {
        return this.address.getPublicPlace();
    }
    public Integer getNumber() {
        return this.address.getNumber();
    }

    public String getComplement() {
        return this.address.getComplement();
    }

    public String getCity() {
        return this.address.getCity();
    }
    public String getState() {
        return this.address.getState();
    }
    public Long getCep() {
        return this.address.getCep();
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
