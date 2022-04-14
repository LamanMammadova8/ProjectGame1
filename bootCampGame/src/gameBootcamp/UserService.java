package gameBootcamp;

import gameBootcamp.entities.concretes.User;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
}
