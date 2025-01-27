package service;




import entity.Description;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.DescriptionRepository;

import java.util.List;

@Service
public class DescriptionService {

    @Autowired
    private DescriptionRepository descriptionRepository;

    // Get all expertise details
    public List<Description> getAllExpertise() {
        return descriptionRepository.findAll();
    }
}

