package Aqil.Bootcamp7.todo.service.impl;

import Aqil.Bootcamp7.todo.dto.UserRequestDto;
import Aqil.Bootcamp7.todo.entity.User;
import Aqil.Bootcamp7.todo.repository.UserRepository;
import Aqil.Bootcamp7.todo.service.UserService;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void register(User user) {

        if (isPasswordNotValid(user)) return;
        if (isEmailNotValid(user)) return;
        userRepository.addUser(user);
        System.out.println("User " + user + " Added Successfully:");
    }

    private static boolean isPasswordNotValid(User user) {
        if (user.getPassword().length() < 4) {
            System.out.println("Users password must be at least 4 character");
            return true;
        }
        return false;
    }

    private static boolean isEmailNotValid(User user) {
        if (!user.getEmail().matches("^(.+)@(\\S+)$")) {
            System.out.println("Email not valid : " + user.getEmail());
            return true;
        }
        return false;
    }


    @Override
    public void login(UserRequestDto userRequest) {
        User user = userRepository.findUserByEmail(userRequest.getEmail());

        if (user == null) {
            System.out.println("User not founded by email " + userRequest.getEmail());
            return;
        }
        if (!user.getPassword().equals(userRequest.getPassword())) {
            System.out.println("Password is incorrect " + userRequest.getPassword());
            return;
        }
        user.setActive(true);
    }

    @Override
    public void logout(long id) {
        User userById = userRepository.findUserById(id);
        if (userById == null) {
            System.out.println("User not found by id: " + id);
            return;
        }
        userById.setActive(false);

    }

    @Override

    public User readUser(long id) {
        User userById = userRepository.findUserById(id);
        if (userById == null) {
            System.out.println("User not found by id: " + id);
            return null;
        }
        if (!userById.isActive()) {
            System.out.println("User is not active. Please login again");
            return null;
        }
        return userById;
    }

    @Override
    public void updateUser(long id, User user) {
        if (isPasswordNotValid(user)) return;
        if (isEmailNotValid(user)) return;
        if (!userRepository.findUserById(id).isActive()) {
            System.out.println("User is not active. Please login again");
            return;
        }
        userRepository.updateUser(id, user);
    }

    @Override
    public void deleteUser(long id) {
        if (!userRepository.findUserById(id).isActive()) {
            System.out.println("User is not active. Please login again");
            return;
        }
        userRepository.removeUser(id);
    }

    @Override
    public User[] getAllUser( ) {

        return userRepository.getAllUsers();
    }



}
