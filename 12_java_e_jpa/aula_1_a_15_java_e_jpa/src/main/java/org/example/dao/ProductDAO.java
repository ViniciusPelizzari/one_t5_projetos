package org.example.dao;

import org.example.entities.ProductEntity;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class ProductDAO {

    private static EntityManager entityManager;

    public ProductDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(ProductEntity productEntity){
        this.entityManager.persist(productEntity);
    }

    public void update(ProductEntity productEntity){
        this.entityManager.merge(productEntity);
    }

    public void remove(ProductEntity productEntity){
        productEntity = entityManager.merge(productEntity);
        this.entityManager.remove(productEntity);
    }

    public ProductEntity findById(Integer id){
        return entityManager.find(ProductEntity.class, id);
    }

    public static List<ProductEntity> findAll(){
        String jpql = "SELECT p FROM productEntity p";
        return entityManager.createQuery(jpql, ProductEntity.class).getResultList();
    }

    public static List<ProductEntity> findByName(String name){
        String jpql = "SELECT p FROM productEntity p WHERE p.name = :nome";
        return entityManager.createQuery(jpql, ProductEntity.class)
                .setParameter("nome", name)
                .getResultList();
    }

    /*usado com o sql que foi passado na anotação NamedQuery na PRODUCTENTITY*/
    /*public static List<ProductEntity> findByName(String name){
        return entityManager.createNamedQuery("ProductEntity.productsByName", ProductEntity.class)
                .setParameter("nome", name)
                .getResultList();
    }*/

    public List<ProductEntity> searchByParametersJpql(String nome, BigDecimal preco, LocalDate dataRegistro){
        String jpql = "SELECT p FROM ProductEntity p WHERE 1=1";
        if(nome !=null && !nome.trim().isEmpty()){
            jpql = " AND p.name = :nome";
        }
        if(preco !=null){
            jpql = " AND p.price = :preco";
        }
        if(dataRegistro !=null){
            jpql = " AND p.registrationDate = :dataRegistro";
        }

        TypedQuery<ProductEntity> query = entityManager.createQuery(jpql, ProductEntity.class);
        if(nome !=null && !nome.trim().isEmpty()){
            query.setParameter("name", nome);
        }
        if(preco !=null){
            query.setParameter("price", preco);
        }
        if(dataRegistro !=null){
            query.setParameter("registrationDate", dataRegistro);
        }

        return entityManager.createQuery(jpql, ProductEntity.class)
                .getResultList();
    }

    /*mesmo código que o acima - diferença = usa CRITERIA*/
    public List<ProductEntity> searchByParametersWithCriteria(String nome, BigDecimal preco, LocalDate dataRegistro) {
        String jpql = "SELECT p FROM ProductEntity p WHERE 1=1";
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<ProductEntity> query = builder.createQuery(ProductEntity.class);
        Root<ProductEntity> from = query.from(ProductEntity.class);

        Predicate filters = builder.and();
        if(nome !=null && !nome.trim().isEmpty()){
            filters = builder.and(filters, builder.equal(from.get("name"), nome));
        }
        if(preco !=null){
            filters = builder.and(filters, builder.equal(from.get("price"), preco));
        }
        if(dataRegistro !=null){
            filters = builder.and(filters, builder.equal(from.get("registrationDate"), dataRegistro));
        }
        query.where(filters);

        return entityManager.createQuery(query).getResultList();
    }
}
