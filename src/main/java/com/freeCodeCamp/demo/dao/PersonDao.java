package com.freeCodeCamp.demo.dao;
import com.freeCodeCamp.demo.model.Person;
import java.util.UUID;

public interface PersonDao {

    // here we have two methods. One to insert person with id we choose. 2nd one to insert a person with random id.
    int insertPerson(UUID id, Person person); // method one: return type integer.

    default int addPerson (Person person) { // method two:
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
