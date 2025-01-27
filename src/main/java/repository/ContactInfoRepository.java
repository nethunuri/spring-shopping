package repository;




import entity.ContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactInfoRepository<ContactInfo> extends JpaRepository<ContactInfo, Integer> {
}

