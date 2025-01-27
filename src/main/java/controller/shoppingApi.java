package controller;




import entity.ContactInfo;
import entity.Description;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import repository.ContactInfoRepository;
import repository.DescriptionRepository;
import repository.ProfileRepository;

import java.util.List;

@RestController
public class shoppingApi {
    @Autowired
    private ProfileRepository profileRepository;


    @Autowired
    private DescriptionRepository expertiseRepository;

    @Autowired
    private ContactInfoRepository contactInfoRepository;


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

    @GetMapping("/description")
    public List<Description> getDescription() {
        ParseTreePattern descriptionRepository = null;
        return (Description) descriptionRepository.findAll();
    }

    // POST method for Contact Information
    @PostMapping("/contact")
    public ContactInfo addContact(@RequestBody ContactInfo contactInfo) {
        return (ContactInfo) contactInfoRepository.save(contactInfo);
    }
}


