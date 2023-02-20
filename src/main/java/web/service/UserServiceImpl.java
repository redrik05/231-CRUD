package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.Dao;
import web.model.User;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    Dao dao;

    @Override
    public List<User> getAllUser() {
        return dao.getAllUsers();
    }
}
