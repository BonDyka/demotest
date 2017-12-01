package loc.abondarev.service;

import loc.abondarev.entity.User;

import java.util.List;

/**
 * @author abondarev.
 * @since 28.11.2017.
 */
public interface IUserService {

    void save(User user);

    void update(User user);

    User getById(int id);

    List<User> findAll();

    void delete(int id);
}
