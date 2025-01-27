package controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.ProfileRepository;

@RestController
public class shoppingApi {
    @Autowired
    private ProfileRepository profileRepository;

    @GetMapping("/profile")
    public Profile getProfile() {
        return new Profile(
                "Nethunuri Rajesh",
                "I am a passionate software developer with expertise in Java, Angular, and microservices.",
                "Java, Angular, Spring Boot, Microservices",
                "Worked on numerous enterprise-grade applications.",
                "Coding, Traveling, Reading",
                "got azure certification",
                "Spring Boot, Angular, Microservices architecture, Cloud Computing",
                "nethunurirajesh@gmail.com"
        );
    }

    public static class Profile {
        private String name;
        private String about;
        private String expertise;
        private String experience;
        private String hobbies;
        private String achievements;
        private String trainings;
        private String email;

        // Constructor, getters and setters

        public Profile(String name, String about, String expertise, String experience, String hobbies,
                       String achievements, String trainings, String email) {
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
}
