package org.example.dao;

import org.example.entities.PeopleEntitye;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;

public class PeopleDAO {

    private static EntityManager entityManager;

    public PeopleDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(PeopleEntitye peopleEntitye){
        this.entityManager.persist(peopleEntitye);
    }

    public void update(PeopleEntitye peopleEntitye){
        this.entityManager.merge(peopleEntitye);
    }

    public void remove(PeopleEntitye peopleEntitye){
        peopleEntitye = entityManager.merge(peopleEntitye);
        this.entityManager.remove(peopleEntitye);
    }

    public PeopleEntitye findById(Integer id){
        return entityManager.find(PeopleEntitye.class, id);
    }

    public static List<PeopleEntitye> findAll(){
        String jpql = "SELECT p FROM PeopleEntitye p";
        return entityManager.createQuery(jpql, PeopleEntitye.class).getResultList();
    }

    public static List<PeopleEntitye> findByName(String name){
        String jpql = "SELECT p FROM PeopleEntitye p WHERE p.fullName = :nome"; /*ou ?1, ?2, ?3... no lugar do :nome e no setParameter, passa o número da posição*/
        return entityManager.createQuery(jpql, PeopleEntitye.class)
                .setParameter("nome", name)
                .getResultList();
    }

    public static List<PeopleEntitye> findByNameProfession(String name){
        String jpql = "SELECT p FROM PeopleEntitye p WHERE p.professionEntitye.name = :nome"; /*ou ?1, ?2, ?3... no lugar do :nome e no setParameter, passa o número da posição*/
        return entityManager.createQuery(jpql, PeopleEntitye.class)
                .setParameter("nome", name)
                .getResultList();
    }

    public static LocalDate findDateByName(String name){
        String jpql = "SELECT p.registrationDate FROM PeopleEntitye p WHERE p.fullName = :nome"; /*ou ?1, ?2, ?3... no lugar do :nome e no setParameter, passa o número da posição*/
        return entityManager.createQuery(jpql, LocalDate.class)
                .setParameter("nome", name)
                .getSingleResult();
    }
}
