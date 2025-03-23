package uz.brb.template.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.brb.template.entity.User;
import uz.brb.template.repository.UserDAO;
import uz.brb.template.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User getUserByUsername(String username) {
        return userDAO.findByUsername(username);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    @Override
    public String addUser(User user) {
        userDAO.save(user);

        return "User has been successfully registered";
    }

    @Override
    public String updateUser(long userId, User user) {
        //userDAO.save(userId, user);

        return "You has successfully updated";
    }
}
