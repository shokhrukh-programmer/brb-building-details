package uz.brb.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.brb.template.dto.request.UserRegistrationRequest;
import uz.brb.template.dto.request.UserUpdateRequest;
import uz.brb.template.entity.User;
import uz.brb.template.repository.UserDAO;
//import uz.brb.template.repository.impl.USERDAOIMPL;

import java.util.List;

@RestController
public class UserController {
    private final UserDAO userDAO;

    @Autowired
    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    @PostMapping("/users")
    public ResponseEntity<String> addUser(@RequestBody UserRegistrationRequest request) {
        User user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .middleName(request.getMiddleName())
                .phoneNumber(request.getPhoneNumber())
                .email(request.getEmail())
                .username(request.getUsername())
                .password(request.getPassword())
                .build();

        userDAO.save(user);

        return new ResponseEntity<>("User successfully added", HttpStatus.OK);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<String> updateUser(@PathVariable("id") long userId, @RequestBody UserUpdateRequest request) {
        User user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .middleName(request.getMiddleName())
                .phoneNumber(request.getPhoneNumber())
                .email(request.getEmail())
                .username(request.getUsername())
                .password(request.getPassword())
                .build();

        //userDAO.(userId, user);

        return new ResponseEntity<>("Successfully updated", HttpStatus.OK);
    }
}
