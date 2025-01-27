package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Description {

    @Id
    private int id;
    private String name;
    private String description;
    private String details;

    // Constructors, Getters and Setters



    public Description(String name, String description, String details) {
        this.name = name;
        this.description = description;
        this.details = details;
    }

    public Description() {

    }


}
