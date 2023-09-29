package org.example.tests;

import org.example.dao.*;
import org.example.entities.*;
import org.example.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegistrationEagerLazy {
    /*LAZY - carregamento preguiçoso - carrega apenas se for requisitado*/
    /*EAGER - carregamento ansioso - carrega junto com os itens*/
    public static void main(String[] args) {
        Initializr();
        EntityManager entityManager = JPAUtil.getEntityManager();
        RequestDAO requestDAO = new RequestDAO(entityManager);
        RequestEntity sale1= requestDAO.searchRequestWithPeople(1l);
        System.out.println(sale1.getPeopleEntity().getAddress().getCity());

        ProductDAO productDAO = new ProductDAO(entityManager);
        productDAO.searchByParametersWithCriteria("Landing Page", null, LocalDate.now());
    }

    public static void Initializr(){
        ProfessionEntity developer = new ProfessionEntity("Developer");
        ProfessionEntity teacher = new ProfessionEntity("Teacher");
        PeopleEntity peopleDev = new PeopleEntity("Developer People", 0, " * * * ", 0, " * * * ", " * * * ", " * * * ", 0l, " * * * ", 00000000000l, developer);
        PeopleEntity peopleTea = new PeopleEntity("Teacher People", 0, " * * * ", 0, " * * * ", " * * * ", " * * * ", 0l, " * * * ", 00000000000l, teacher);
        CategoryEntity webSites = new CategoryEntity("webSites");
        CategoryEntity classes = new CategoryEntity("Classes");
        ProductEntity landingPage = new ProductEntity("Landing Page", new BigDecimal("9999.99"), "Landing Page - Portfólio", webSites);
        ProductEntity mathClass = new ProductEntity("Math Class", new BigDecimal("19999.99"), "Math Classes - Completed", classes);

        /*passando o nome da proprierties do DB que foi informada no PERSISTENCE.XML*/
        EntityManager entityManager = JPAUtil.getEntityManager();

        PeopleDAO peopleDAO = new PeopleDAO(entityManager);
        ProfessionDAO professionDAO = new ProfessionDAO(entityManager);
        CategoryDAO categoryDAO = new CategoryDAO(entityManager);
        ProductDAO productDAO = new ProductDAO(entityManager);

        /*como no PERSISTENCE.XML está sendo usado o RESOURCE_LOCAL no PERSISTENCE-UNIT é necessário iniciar a transação do DB*/
        entityManager.getTransaction().begin();

        /*informando ao JPA qual o objeto que será feita a inserção no DB*/
        professionDAO.save(developer);
        professionDAO.save(teacher);
        peopleDAO.save(peopleDev);
        peopleDAO.save(peopleTea);
        categoryDAO.save(webSites);
        categoryDAO.save(classes);
        productDAO.save(landingPage);
        productDAO.save(mathClass);

        RequestEntity requestEntity = new RequestEntity(peopleDev);
        requestEntity.addItems(new ItemsRequestEntity(3, requestEntity, landingPage));

        RequestDAO requestDAO = new RequestDAO(entityManager);
        requestDAO.save(requestEntity);

        /*fazendo um COMMIT da transação*/
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
