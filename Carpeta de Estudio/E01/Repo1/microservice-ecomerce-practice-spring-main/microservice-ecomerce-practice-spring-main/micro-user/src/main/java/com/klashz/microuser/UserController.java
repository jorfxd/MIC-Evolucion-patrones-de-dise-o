package com.klashz.microuser;

import com.klashz.microuser.utils.RolUser;
import jakarta.ws.rs.GET;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @PostMapping("/save")
    public ResponseEntity<UserEntity> save(@RequestBody UserEntity user) {
        if(user.getRol() == null || !user.getRol().equals(RolUser.ADMIN)){
            user.setRol(RolUser.CLIENT);
        }else {
            user.setRol(RolUser.ADMIN);
        }
        UserEntity u  = userRepository.save(user);
        return ResponseEntity.status(201).body(u);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserEntity> findById(@PathVariable long id) {
        Optional<UserEntity> user = userRepository.findById(id);
        return user.map(userEntity -> ResponseEntity.status(200).body(userEntity)).orElseGet(() -> ResponseEntity.status(404).body(null));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<UserEntity> delete(@PathVariable long id) {
        Optional<UserEntity> user = userRepository.findById(id);
        if(user.isPresent()) {
            userRepository.delete(user.get());
            return ResponseEntity.ok(user.get());
        }
        return ResponseEntity.notFound().build();
    }
}
