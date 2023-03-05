package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.Dao;
import web.model.User;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    Dao dao;

    @Override
    public List<User> getAllUsers() {
        return dao.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        dao.addUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        dao.deleteUser(id);
    }

    @Override
    @Transactional
    public void updateUser(Long id, User user) {
        dao.updateUser(id, user);
    }

    @Override
    public User showUser(Long id) {
        return dao.getUser(id);
    }
}
