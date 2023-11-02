package org.example.dao;

import org.example.entities.PeopleEntity;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;

public class PeopleDAO {

    private static EntityManager entityManager;

    public PeopleDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(PeopleEntity peopleEntity){
        this.entityManager.persist(peopleEntity);
    }

    public void update(PeopleEntity peopleEntity){
        this.entityManager.merge(peopleEntity);
    }

    public void remove(PeopleEntity peopleEntity){
        peopleEntity = entityManager.merge(peopleEntity);
        this.entityManager.remove(peopleEntity);
    }

    public PeopleEntity findById(Integer id){
        return entityManager.find(PeopleEntity.class, id);
    }

    public static List<PeopleEntity> findAll(){
        String jpql = "SELECT p FROM PeopleEntity p";
        return entityManager.createQuery(jpql, PeopleEntity.class).getResultList();
    }

    public static List<PeopleEntity> findByName(String name){
        String jpql = "SELECT p FROM PeopleEntity p WHERE p.fullName = :nome"; /*ou ?1, ?2, ?3... no lugar do :nome e no setParameter, passa o número da posição*/
        return entityManager.createQuery(jpql, PeopleEntity.class)
                .setParameter("nome", name)
                .getResultList();
    }

    public static List<PeopleEntity> findByNameProfession(String name){
        String jpql = "SELECT p FROM PeopleEntity p WHERE p.professionEntity.name = :nome"; /*ou ?1, ?2, ?3... no lugar do :nome e no setParameter, passa o número da posição*/
        return entityManager.createQuery(jpql, PeopleEntity.class)
                .setParameter("nome", name)
                .getResultList();
    }

    public static LocalDate findDateByName(String name){
        String jpql = "SELECT p.registrationDate FROM PeopleEntity p WHERE p.fullName = :nome"; /*ou ?1, ?2, ?3... no lugar do :nome e no setParameter, passa o número da posição*/
        return entityManager.createQuery(jpql, LocalDate.class)
                .setParameter("nome", name)
                .getSingleResult();
    }
}
