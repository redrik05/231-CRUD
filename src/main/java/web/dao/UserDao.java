package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDao implements Dao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> getAllUsers() {
        List<User> kek = em.createQuery("FROM User", User.class).getResultList();
        return kek;
    }

    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Override
    public void deleteUser(Long id) {
        em.remove(getUser(id));
    }

    @Override
    public void updateUser(Long id, User user) {
        User userToUpdate = em.find(User.class, id);
        em.detach(userToUpdate);
        userToUpdate.setName(user.getName());
        userToUpdate.setLastName(user.getLastName());
        em.merge(userToUpdate);
    }

    @Override
    public User getUser(Long id) {
        return em.find(User.class, id);
    }

}
