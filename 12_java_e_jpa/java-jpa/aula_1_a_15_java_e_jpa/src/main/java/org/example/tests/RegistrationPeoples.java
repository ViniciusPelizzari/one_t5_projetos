package org.example.tests;

import org.example.dao.ProfessionDAO;
import org.example.entities.ProfessionEntity;
import org.example.dao.PeopleDAO;
import org.example.entities.PeopleEntity;
import org.example.util.JPAUtil;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;

public class RegistrationPeoples {

    public static void main(String[] args) {
        registrationPeople();
        Integer id = 1;

        EntityManager entityManager = JPAUtil.getEntityManager();
        PeopleDAO peopleDAO = new PeopleDAO(entityManager);

        PeopleEntity people = peopleDAO.findById(id);
        people.toString();

        List<PeopleEntity> all = PeopleDAO.findAll();
        all.forEach(p -> p.getFullName());

        List<PeopleEntity> byName = PeopleDAO.findByName("Test People");
        byName.forEach(p -> p.getAddress());

        List<PeopleEntity> byProfession = PeopleDAO.findByNameProfession("Developer");
        byProfession.forEach(p -> p.getEmail());

        LocalDate date = PeopleDAO.findDateByName("Test People");
        System.out.println("Data: " + date);
    }

    public static void registrationPeople(){
        ProfessionEntity developer = new ProfessionEntity("Developer");
        PeopleEntity peopleTest = new PeopleEntity("Test People", 0, " * * * ", 0, " * * * ", " * * * ", " * * * ", 0l,  " * * * ", 00000000000l, developer);

        /*passando o nome da proprierties do DB que foi informada no PERSISTENCE.XML*/
        EntityManager entityManager = JPAUtil.getEntityManager();

        PeopleDAO peopleDAO = new PeopleDAO(entityManager);
        ProfessionDAO professionDAO = new ProfessionDAO(entityManager);

        /*como no PERSISTENCE.XML está sendo usado o RESOURCE_LOCAL no PERSISTENCE-UNIT é necessário iniciar a transação do DB*/
        entityManager.getTransaction().begin();

        /*informando ao JPA qual o objeto que será feita a inserção no DB*/
        peopleDAO.save(peopleTest);
        professionDAO.save(developer);

        /*fazendo um COMMIT da transação*/
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
