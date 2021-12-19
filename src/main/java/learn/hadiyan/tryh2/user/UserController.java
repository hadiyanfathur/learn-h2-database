package learn.hadiyan.tryh2.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserEntity>> getAll(){
        List<UserEntity> response = userService.getAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> insert(@RequestBody UserRequest userRequest){
        userService.insert(userRequest);
        return new ResponseEntity<>("sukses insert data", HttpStatus.OK);
    }

    @GetMapping("/{username}")
    public ResponseEntity<UserEntity> getById(@PathVariable(name = "username") String username){
        UserEntity response = userService.getByUsername(username);
        return ResponseEntity.ok(response);
    }
}
