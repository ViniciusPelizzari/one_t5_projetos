package org.example.model;

import org.example.entities.CategoryEntity;
import org.example.entities.ProductEntity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class ClassesModel extends ProductEntity {

    private String classes;
    private Integer classMinutes;

    public ClassesModel(){

    }

    public ClassesModel(String name, BigDecimal price, String description, CategoryEntity categoryEntity, String classes, Integer classMinutes) {
        super(name, price, description, categoryEntity);
        this.classes = classes;
        this.classMinutes = classMinutes;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Integer getClassMinutes() {
        return classMinutes;
    }

    public void setClassMinutes(Integer classMinutes) {
        this.classMinutes = classMinutes;
    }

    @Override
    public String toString() {
        return "ClassesModel{" +
                "classes='" + classes + '\'' +
                ", classMinutes=" + classMinutes +
                "} " + super.toString();
    }
}
