package web.dao;

import web.model.User;

import java.util.List;

public interface Dao {
    List<User> getAllUsers();
}
