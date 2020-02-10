package com.freeCodeCamp.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

public class Person {
    private UUID id;
    @NonNull
    // name can't be Blank (This is on dao level that will not accept Blankm but if you want user not post Blank .. nned to validate it in the method itself. e.g) @Valid)
    private String name;

    public Person() {
    }

    public Person( @JsonProperty("id") UUID id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
