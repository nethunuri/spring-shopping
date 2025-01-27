package repository;


import com.ust.profilewebapp.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository<Profile> extends repository.JpaRepository<Profile, Long> {
    // You can define custom queries here, if needed
}
