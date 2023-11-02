package org.example.tests;

import org.example.dao.*;
import org.example.entities.*;
import org.example.util.JPAUtil;
import org.example.vo.ReportSalesVo;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class RegistrationRequests {
    public static void main(String[] args) {
        registration();

        EntityManager entityManager = JPAUtil.getEntityManager();

        entityManager.getTransaction().begin();

        ProductDAO productDAO = new ProductDAO(entityManager);
        ProductEntity productEntity = productDAO.findById(1);
        PeopleDAO peopleDAO = new PeopleDAO(entityManager);
        PeopleEntity peopleEntity = peopleDAO.findById(1);

        RequestEntity requestEntity = new RequestEntity(peopleEntity);
        requestEntity.addItems(new ItemsRequestEntity(3, requestEntity, productEntity));

        RequestDAO requestDAO = new RequestDAO(entityManager);
        requestDAO.save(requestEntity);

        entityManager.getTransaction().commit();

        BigDecimal totalSold = requestDAO.totalAmountOrdered();
        System.out.println("Total value: $" + totalSold);

        /*List<Object[]> report = requestDAO.salerReport();
        for(Object[] objects : report){
            System.out.println(objects[0]);
            System.out.println(objects[1]);
            System.out.println(objects[2]);
        }*/
        List<ReportSalesVo> report = requestDAO.salerReport();
        report.forEach(System.out::println);
    }

    public static void registration(){
        ProfessionEntity developer = new ProfessionEntity("Developer");
        PeopleEntity peopleTest = new PeopleEntity("Test People", 0, " * * * ", 0, " * * * ", " * * * ", " * * * ", 0l," * * * ", 00000000000l, developer);
        CategoryEntity sites = new CategoryEntity("Sites");
        ProductEntity landingPage = new ProductEntity("Landing Page", new BigDecimal("9999.99"), "Landing Page - Portfólio", sites);

        /*passando o nome da proprierties do DB que foi informada no PERSISTENCE.XML*/
        EntityManager entityManager = JPAUtil.getEntityManager();

        PeopleDAO peopleDAO = new PeopleDAO(entityManager);
        ProfessionDAO professionDAO = new ProfessionDAO(entityManager);
        CategoryDAO categoryDAO = new CategoryDAO(entityManager);
        ProductDAO productDAO = new ProductDAO(entityManager);

        /*como no PERSISTENCE.XML está sendo usado o RESOURCE_LOCAL no PERSISTENCE-UNIT é necessário iniciar a transação do DB*/
        entityManager.getTransaction().begin();

        /*informando ao JPA qual o objeto que será feita a inserção no DB*/
        peopleDAO.save(peopleTest);
        professionDAO.save(developer);
        categoryDAO.save(sites);
        productDAO.save(landingPage);

        /*fazendo um COMMIT da transação*/
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
