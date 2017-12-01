package loc.abondarev.dao;

import loc.abondarev.entity.User;

import java.util.List;

/**
 * @author abondarev.
 * @since 28.11.2017.
 */
public interface IUserDao {

    void save(User user);

    void update(User user);

    User getById(int id);

    List<User> findAll();

    void delete(int id);
}
