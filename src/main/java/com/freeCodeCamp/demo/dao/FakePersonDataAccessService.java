package com.freeCodeCamp.demo.dao;

import com.freeCodeCamp.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository // we initiated this class as bean (Repository)
public class FakePersonDataAccessService implements PersonDao {

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int addPersonWithID(UUID id, Person person){
        DB.add(new Person(id, person.getName()));
        return 1; // to know the insertion works fine
    }
}
