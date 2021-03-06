package com.freeCodeCamp.demo.service;

import com.freeCodeCamp.demo.dao.PersonDao;
import com.freeCodeCamp.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonDao personDao; // get a reference of the actual person DAO.

    @Autowired // 1. we referenced the class/interface we want to use (private final PersonDao personDao) 2. We instantiated the class FakePerson.... using @Repositry 3. Now, we are autowiring.
    public PersonService(@Qualifier("postgres") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person); // get a reference of the actual person DAO.
    }

    public List<Person> getAllPeople(){
        return personDao.selectAllPeople();
    }

    public Optional<Person> getPersonById (UUID id){
        return personDao.selectPersonByID(id);
    }
    public int deletePerson (UUID id){
        return personDao.deletePersonByID(id);
    }

    public int updatePerson(UUID id, Person newPerson){
        return personDao.updatePersonByID(id, newPerson);
    }

}
