package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class ContactInfo {


    @Id
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String description;

    // Constructors, Getters and Setters

    public ContactInfo() {}

    public ContactInfo(String name, String email, String phoneNumber, String description) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.description = description;
    }

    public void setId(Long id) {
        this.id = Math.toIntExact(id);
    }

    public Long getId() {
        return (long) id;
    }


}
