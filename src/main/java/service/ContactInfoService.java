package service;


import entity.ContactInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ContactInfoRepository;

@Service
public class ContactInfoService {

    @Autowired
    private ContactInfoRepository contactInfoRepository;

    // Save new contact information
    public ContactInfo saveContactInfo(ContactInfo contactInfo) {
        return (ContactInfo) contactInfoRepository.save(contactInfo);
    }
}

