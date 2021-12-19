package learn.hadiyan.tryh2.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long>, UserRepositoryDomain {
    @Override
    @Query("SELECT user FROM UserEntity user WHERE user.username = :username ")
    Optional<UserEntity> findByUsername(String username);
}
