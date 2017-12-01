package loc.abondarev.service;

import loc.abondarev.dao.IUserDao;
import loc.abondarev.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author abondarev.
 * @since 30.11.2017.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    public IUserDao userDao;

    public void save(User user) {
        this.userDao.save(user);
    }

    public void update(User user) {
        this.userDao.update(user);
    }

    public User getById(int id) {
        return this.userDao.getById(id);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public void delete(int id) {
        this.userDao.delete(id);
    }
}
