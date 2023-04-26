package Aqil.Bootcamp7.todo.controller;

import Aqil.Bootcamp7.todo.dto.UserRequestDto;
import Aqil.Bootcamp7.todo.entity.User;
import Aqil.Bootcamp7.todo.service.UserService;
import Aqil.Bootcamp7.todo.service.impl.UserServiceImpl;

import java.util.Scanner;

public class UserController {
    private final Scanner scanner = new Scanner(System.in);
    private UserService userService;

//    public UserController(UserServiceImpl userService) {
//    }

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void register() {
        long id = Long.parseLong(input("Enter id: "));
        String name = input("name");
        String email = input("email");
        String password = input("password");
        User user = new User(id, name, email, password);
        userService.register(user);
    }



    public void login() {
        String email = input("email");
        String password = input("password");
        UserRequestDto userRequest = new UserRequestDto(email,password);
        userService.login(userRequest);
    }

    public void logout() {
        long id = Long.parseLong(input("Enter id"));
        userService.logout(id);
    }

    public User readUser() {
     long id = Long.parseLong(input("Enter id"));
     return userService.readUser(id);
    }

    public void updateUser() {
        long id = Long.parseLong(input("Enter id: "));
        String name = input("name");
        String email = input("email");
        String password = input("password");
        User user = new User(name, email, password);
        userService.updateUser(id,user);
    }

    public void deleteUser() {
        long id = Long.parseLong(input("Enter id: "));
        userService.deleteUser(id);
    }

    public User[] getAllUser() {
     return    userService.getAllUser();
    }
    private String input(String title) {
        System.out.println(title);
        return scanner.next();
    }


}
