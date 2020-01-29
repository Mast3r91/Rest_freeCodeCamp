package com.freeCodeCamp.demo.dao;
import com.freeCodeCamp.demo.model.Person;
import java.util.UUID;

public interface personDao {

    // here we have two methods. One id to insert person with id we choose. 2nd one to insert person with random id.
    int insertPerson(UUID id, Person person);

    default int addPerson (Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
