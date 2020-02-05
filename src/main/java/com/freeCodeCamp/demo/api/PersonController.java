package com.freeCodeCamp.demo.api;

import com.freeCodeCamp.demo.model.Person;
import com.freeCodeCamp.demo.service.PersonService;

public class PersonController {

    private final PersonService personService; // having a reference to the actual service.

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    public void addPerson(Person person){
        personService.addPerson(person);
    }
}
