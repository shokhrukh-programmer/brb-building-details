//package uz.brb.template.repository.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//import uz.brb.template.entity.User;
//import uz.brb.template.repository.UserDAO;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//@Repository
//public class UserDAOImpl implements UserDAO {
//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public UserDAOImpl(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    @Override
//    public User findUserByUsername(String username) {
//        return jdbcTemplate.queryForObject("select * from users where username = ?", User.class, username);
//    }
//
//    @Override
//    public List<User> findAll() {
//        return jdbcTemplate.query("select * from users", new CustomRowMapper());
//    }
//
//    @Override
//    public int addUser(User user) {
//        String sql = "insert into users (first_name, last_name, middle_name, phone_number, email, username, password) " +
//                "values (?, ?, ?, ?, ?, ?, ?)";
//
//        return jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(), user.getMiddleName(),
//                user.getPhoneNumber(), user.getEmail(), user.getUsername(), user.getPassword());
//    }
//
//    @Override
//    public int updateUser(long userId, User user) {
//        String sql = "update users set first_name = ?, last_name = ?, middle_name = ?, " +
//                "phone_number = ?, email = ?, username = ?, password = ? where id = ?";
//
//        return jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(), user.getMiddleName(),
//                user.getPhoneNumber(), user.getEmail(), user.getUsername(), user.getPassword(), userId);
//    }
//
//    private static class CustomRowMapper implements RowMapper<User> {
//        @Override
//        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//            return User.builder()
//                    .id(rs.getLong("id"))
//                    .firstName(rs.getString("first_name"))
//                    .lastName(rs.getString("last_name"))
//                    .middleName(rs.getString("middle_name"))
//                    .phoneNumber(rs.getString("phone_number"))
//                    .email(rs.getString("email"))
//                    .username(rs.getString("username"))
//                    .password(rs.getString("password"))
//                    .build();
//        }
//    }
//}
