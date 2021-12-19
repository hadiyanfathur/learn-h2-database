package learn.hadiyan.tryh2.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String username;

    private String password;

    public UserEntity(UserRequest userRequest) {
        this.username = userRequest.getUsername();
        this.password = userRequest.getPassword();
    }

    public UserEntity() {
    }

}
