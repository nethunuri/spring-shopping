package repository;


public interface ProfileRepository<Profile> extends repository.JpaRepository<Profile, Long> {
    // You can define custom queries here, if needed
}
