package com.freeCodeCamp.demo.service;

import com.freeCodeCamp.demo.dao.PersonDao;
import com.freeCodeCamp.demo.model.Person;


public class PersonService {

    private final PersonDao personDao; // get a reference of the actual person DAO.

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person); // get a reference of the actual person DAO.
    }
}
