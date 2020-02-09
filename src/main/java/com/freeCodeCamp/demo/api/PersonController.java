package com.freeCodeCamp.demo.api;

import com.freeCodeCamp.demo.model.Person;
import com.freeCodeCamp.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api")
@RestController
public class PersonController {

    private final PersonService personService; // having a reference to the actual service.

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @PostMapping(value = "v1/person")
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    @GetMapping(value = "v1/person")
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }

    @GetMapping(value = "v1/person/{id}")
    public Person getPersonbyId (@PathVariable("id") UUID id){
        return personService.getPersonById(id).orElse(null);
    }





}
