package learn.hadiyan.tryh2.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {

    private final UserRepositoryDomain userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }

    public void insert(UserRequest userRequest) {
        UserEntity user = new UserEntity(userRequest);
        userRepository.save(user);
        log.info(user.getId());
    }

    public UserEntity getByUsername(String username) {
        return userRepository.findByUsername(username).orElse(new UserEntity());
    }
}
