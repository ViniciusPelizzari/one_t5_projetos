package org.example.dao;

import org.example.entities.PeopleEntitye;
import org.example.entities.ProfessionEntitye;

import javax.persistence.EntityManager;
import java.util.List;

public class ProfessionDAO {

    private static EntityManager entityManager;

    public ProfessionDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(ProfessionEntitye professionEntitye){
        this.entityManager.persist(professionEntitye);
    }

    public void update(ProfessionEntitye professionEntitye){
        this.entityManager.merge(professionEntitye);
    }

    public void remove(ProfessionEntitye professionEntitye){
        professionEntitye = entityManager.merge(professionEntitye);
        this.entityManager.remove(professionEntitye);
    }

    public ProfessionEntitye findById(Integer id){
        return entityManager.find(ProfessionEntitye.class, id);
    }

    public static List<ProfessionEntitye> findAll(){
        String jpql = "SELECT p FROM ProfessionEntitye p";
        return entityManager.createQuery(jpql, ProfessionEntitye.class).getResultList();
    }

    public static List<ProfessionEntitye> findByName(String name){
        String jpql = "SELECT p FROM ProfessionEntitye p WHERE p.name = :nome";
        return entityManager.createQuery(jpql, ProfessionEntitye.class)
                .setParameter("nome", name)
                .getResultList();
    }
}
