package Aqil.Bootcamp7.todo;

import Aqil.Bootcamp7.todo.controller.UserController;
import Aqil.Bootcamp7.todo.repository.UserRepository;
import Aqil.Bootcamp7.todo.service.impl.UserServiceImpl;

import java.util.Scanner;

public class ToDoApplication {


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        UserRepository userRepository = new UserRepository();
        UserServiceImpl userService = new UserServiceImpl(userRepository);
        UserController userController =new UserController(userService);

        while (true){
            System.out.println();
            menu();
            int command = scanner.nextInt();
            switch (command){
                case 1->userController.register();
                case 2->userController.login();
                case 3->userController.readUser();
                case 4->userController.getAllUser();
                case 5->userController.deleteUser();
                case 6->userController.updateUser();
                case 7-> System.out.println("Adding");
                case 8-> System.out.println("Updating");
                case 9-> System.out.println("Deleting");
                case 10->userController.logout();
                default -> {return;}
            }
        }

    }

    public static void menu(){
        System.out.println("""
                Select 1 option (1-10)
                1.Login
                2.Register
                3.Get user
                4.Get all users
                5.Delete user
                6.Update user
                7.Add task
                8.Update task
                9.Delete task
                10.Logout
                11.Exit
                """);
    }
}
