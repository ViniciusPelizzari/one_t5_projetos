package org.example.entities;

import javax.persistence.Embeddable;

@Embeddable /*informando que está classe pode ser embutida*/
public class Address {

    private String publicPlace;
    private Integer number;
    private String complement;
    private String city;
    private String state;
    private Long cep;

    public Address(){

    }

    public Address(String publicPlace, Integer number, String complement, String city, String state, Long cep) {
        this.publicPlace = publicPlace;
        this.number = number;
        this.complement = complement;
        this.city = city;
        this.state = state;
        this.cep = cep;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        this.cep = cep;
    }
}
