package com.freeCodeCamp.demo.api;

import com.freeCodeCamp.demo.model.Person;
import com.freeCodeCamp.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public void addPerson(@Valid @NonNull @RequestBody Person person){
        personService.addPerson(person);
    }

    @GetMapping(value = "v1/person")
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }

    @GetMapping(value = "v1/person/{id}")
    public Person getPersonbyId (@PathVariable("id") UUID id){ // should id be valid @ nonnull (@Valid @NonNull)
        return personService.getPersonById(id).orElse(null);
    }

    @DeleteMapping(value = "v1/person/{id}")
    public void deletePersonByID(@PathVariable("id") UUID id ){
        personService.deletePerson(id);
    }

    @PutMapping(value = "v1/person/{id}")
    public void updatePerson(@Valid @NonNull @PathVariable("id") UUID id, @RequestBody Person personToUpdate){
        personService.updatePerson(id, personToUpdate);
    }
}
