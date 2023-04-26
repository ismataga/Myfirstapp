package Aqil.Bootcamp7.todo.service;

import Aqil.Bootcamp7.todo.dto.UserRequestDto;
import Aqil.Bootcamp7.todo.entity.User;

public interface UserService {
    void register(User user);
    void login(UserRequestDto userRequest);
    void logout(long id);
    User readUser(long id);
    void updateUser(long id, User user);
    void deleteUser(long id);
    User[] getAllUser();



}
