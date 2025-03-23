package uz.brb.template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.brb.template.entity.User;

import java.util.List;

public interface UserDAO extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findUserByUsername(String username);
    List<User> findAll();
    int addUser(User user);
    int updateUser(long userId, User user);
}
