package web.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import web.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    void newUser(User user);

    List<User> getListUsers();

    User getUserById(long id);

    void deleteUser(long id);

    void editUser(User user);

    long getId(String email);
}
