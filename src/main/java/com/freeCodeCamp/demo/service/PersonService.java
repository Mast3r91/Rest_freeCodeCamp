package com.freeCodeCamp.demo.service;

import com.freeCodeCamp.demo.dao.PersonDao;
import com.freeCodeCamp.demo.model.Person;

public class PersonService {

    private final PersonDao persondao;

    public int addPerson(Person person){
        return PersonDao.insertPerson(person);
    }
}
