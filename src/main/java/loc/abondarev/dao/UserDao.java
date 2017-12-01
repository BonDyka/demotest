package loc.abondarev.dao;

import loc.abondarev.entity.User;
import loc.abondarev.mapper.UserMaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author abondarev.
 * @since 30.11.2017.
 */
@Repository
public class UserDao implements IUserDao {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(User user) {
        String sql = "INSERT INTO user (name, email, age) VALUES (?, ?, ?)";
        this.jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge());
    }

    public void update(User user) {
        String sql = "UPDATE user SET name=?, email=?, age=? WHERE id=?";
        this.jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge(), user.getId());
    }

    public User getById(int id) {
        String sql = "SELECT * FROM user WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new UserMaper(), id);
    }

    public List<User> findAll() {
        String sql = "SELECT * FROM user";
        return this.jdbcTemplate.query(sql, new UserMaper());
    }

    public void delete(int id) {
        String sql = "DELETE FROM user WHERE id=?";
        this.jdbcTemplate.update(sql, id);
    }
}
