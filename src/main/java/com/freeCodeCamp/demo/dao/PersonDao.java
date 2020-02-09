package com.freeCodeCamp.demo.dao;
import com.freeCodeCamp.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

//-----------------------------
// DAO:  Data Access Object
//-----------------------------

public interface PersonDao {
    // here we have two methods. One to insert person with id we choose. 2nd one to insert a person with random id.
   int addPersonWithID(UUID id, Person person); // method one: return type integer.

    default int insertPerson(Person person) { // method two:
        UUID id = UUID.randomUUID();
        return addPersonWithID(id, person);
    }

     List<Person> selectAllPeople();

    Optional<Person> selectPersonByID (UUID id);

     int deletePersonByID( UUID id);

     int updatePersonByID (UUID id, Person person);


}
