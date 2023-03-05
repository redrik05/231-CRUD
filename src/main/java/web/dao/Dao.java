package web.dao;

import web.model.User;

import java.util.List;

public interface Dao {
    List<User> getAllUsers();
    void addUser(User user);
    void deleteUser(Long id);
    void updateUser(Long id, User user);
    User getUser(Long id);
}
