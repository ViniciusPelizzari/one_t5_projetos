package org.example.dao;

import org.example.entities.RequestEntity;
import org.example.vo.ReportSalesVo;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class RequestDAO {

    private static EntityManager entityManager;

    public RequestDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(RequestEntity requestEntity){
        this.entityManager.persist(requestEntity);
    }

    public void update(RequestEntity requestEntity){
        this.entityManager.merge(requestEntity);
    }

    public void remove(RequestEntity requestEntity){
        requestEntity = entityManager.merge(requestEntity);
        this.entityManager.remove(requestEntity);
    }

    public RequestEntity findById(Integer id){
        return entityManager.find(RequestEntity.class, id);
    }

    public static List<RequestEntity> findAll(){
        String jpql = "SELECT p FROM requestEntity p";
        return entityManager.createQuery(jpql, RequestEntity.class).getResultList();
    }

    public static List<RequestEntity> findByName(String name){
        String jpql = "SELECT p FROM requestEntity p WHERE p.name = :nome";
        return entityManager.createQuery(jpql, RequestEntity.class)
                .setParameter("nome", name)
                .getResultList();
    }

    public static BigDecimal totalAmountOrdered(){
        String jpql = "SELECT SUM(p.totalSaleValue) FROM RequestEntity p";
        return entityManager.createQuery(jpql, BigDecimal.class)
                .getSingleResult();
    }

    /*public List<Object[]> salerReport(){
        String jpql = "SELECT productEntity.name, " +
                "SUM(items.amount), " +
                "MAX(requestEntity.dateSale) " +
                "FROM RequestEntity requestEntity " +
                "JOIN requestEntity.productEntities items " +
                "JOIN items.productEntity productEntity " +
                "GROUP BY productEntity.name " +
                "ORDER BY SUM(items.amount) DESC";
        return entityManager.createQuery(jpql, Object[].class)
                .getResultList();
    }*/

    public List<ReportSalesVo> salerReport(){
        String jpql = "SELECT new org.example.vo.ReportSalesVo( " +
                "productEntity.name, " +
                "SUM(items.amount), " +
                "MAX(requestEntity.dateSale)) " +
                "FROM RequestEntity requestEntity " +
                "JOIN requestEntity.productEntities items " +
                "JOIN items.productEntity productEntity " +
                "GROUP BY productEntity.name " +
                "ORDER BY SUM(items.amount) DESC";
        return entityManager.createQuery(jpql, ReportSalesVo.class)
                .getResultList();
    }

    public RequestEntity searchRequestWithPeople(Long id){
        return entityManager.createQuery("SELECT p FROM RequestEntity p JOIN FETCH p.peopleEntity WHERE p.id = :id", RequestEntity.class)
                .setParameter("id", id) /*JOIN FETCH - utilizado para carregar um relacionamento mapeado como LAZY*/
                .getSingleResult();
    }
}
