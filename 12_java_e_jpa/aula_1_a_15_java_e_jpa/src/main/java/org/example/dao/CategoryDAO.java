package org.example.dao;

import org.example.entities.CategoryEntity;

import javax.persistence.EntityManager;
import java.util.List;

public class CategoryDAO {

    private static EntityManager entityManager;

    public CategoryDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(CategoryEntity categoryEntity){
        this.entityManager.persist(categoryEntity);
    }

    public void update(CategoryEntity categoryEntity){
        this.entityManager.merge(categoryEntity);
    }

    public void remove(CategoryEntity categoryEntity){
        categoryEntity = entityManager.merge(categoryEntity);
        this.entityManager.remove(categoryEntity);
    }

    public CategoryEntity findById(Integer id){
        return entityManager.find(CategoryEntity.class, id);
    }

    public static List<CategoryEntity> findAll(){
        String jpql = "SELECT p FROM categoryEntity p";
        return entityManager.createQuery(jpql, CategoryEntity.class).getResultList();
    }

    public static List<CategoryEntity> findByName(String name){
        String jpql = "SELECT p FROM categoryEntity p WHERE p.name = :nome";
        return entityManager.createQuery(jpql, CategoryEntity.class)
                .setParameter("nome", name)
                .getResultList();
    }
}
