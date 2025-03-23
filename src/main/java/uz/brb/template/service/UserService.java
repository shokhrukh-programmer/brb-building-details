package uz.brb.template.service;

import uz.brb.template.entity.User;

import java.util.List;

public interface UserService {
    User getUserByUsername(String username);
    List<User> getAllUsers();
    String addUser(User user);
    String updateUser(long userId, User user);
}
