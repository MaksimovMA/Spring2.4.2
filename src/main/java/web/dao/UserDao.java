package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void newUser(User user);

    List<User> getListUsers();

    User getUserById(long id);

    void deleteUser(long id);

    void editUser(User user);

    long getId(String email);
}
