package org.example.dao;

import org.example.entities.ProfessionEntity;

import javax.persistence.EntityManager;
import java.util.List;

public class ProfessionDAO {

    private static EntityManager entityManager;

    public ProfessionDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(ProfessionEntity professionEntity){
        this.entityManager.persist(professionEntity);
    }

    public void update(ProfessionEntity professionEntity){
        this.entityManager.merge(professionEntity);
    }

    public void remove(ProfessionEntity professionEntity){
        professionEntity = entityManager.merge(professionEntity);
        this.entityManager.remove(professionEntity);
    }

    public ProfessionEntity findById(Integer id){
        return entityManager.find(ProfessionEntity.class, id);
    }

    public static List<ProfessionEntity> findAll(){
        String jpql = "SELECT p FROM ProfessionEntity p";
        return entityManager.createQuery(jpql, ProfessionEntity.class).getResultList();
    }

    public static List<ProfessionEntity> findByName(String name){
        String jpql = "SELECT p FROM ProfessionEntity p WHERE p.name = :nome";
        return entityManager.createQuery(jpql, ProfessionEntity.class)
                .setParameter("nome", name)
                .getResultList();
    }
}
