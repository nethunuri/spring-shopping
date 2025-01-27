package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String about;
    private String expertise;
    private String experience;
    private String hobbies;
    private String achievements;
    private String trainings;
    private String email;

    // Constructor, Getters and Setters

    public Profile(String name, String about, String expertise, String experience, String hobbies, String achievements, String trainings, String email) {
        this.name = name;
        this.about = about;
        this.expertise = expertise;
        this.experience = experience;
        this.hobbies = hobbies;
        this.achievements = achievements;
        this.trainings = trainings;
        this.email = email;
    }

    // Getters and Setters...
}
