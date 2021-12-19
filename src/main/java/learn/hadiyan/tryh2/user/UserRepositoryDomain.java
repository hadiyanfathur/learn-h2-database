package learn.hadiyan.tryh2.user;

import java.util.List;
import java.util.Optional;

public interface UserRepositoryDomain {
    List<UserEntity> findAll();
    UserEntity save(UserEntity entity);
    Optional<UserEntity> findByUsername(String username);
}
