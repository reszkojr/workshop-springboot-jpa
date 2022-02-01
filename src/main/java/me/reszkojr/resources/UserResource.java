package me.reszkojr.resources;

import me.reszkojr.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User("maria", "maria@gmail.com", "4164894886", "123456");
        return ResponseEntity.ok().body(u);
    }
}
