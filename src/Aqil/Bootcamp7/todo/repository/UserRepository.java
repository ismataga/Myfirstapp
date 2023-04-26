package Aqil.Bootcamp7.todo.repository;

import Aqil.Bootcamp7.todo.entity.User;

public class UserRepository {

    private User[] users = new User[10];
    private int count = 0;

    public User[] getAllUsers() {
        return users;
    }

    public void addUser(User user) {
        users[count++] = user;
    }

    public void updateUser(long id,User user) {
        User userById = findUserById(id);
        if(userById == null){
            System.out.println("User not found by id: " +   id);
            return;
        }
        userById.setName(user.getName());
        userById.setEmail(user.getEmail());
        userById.setPassword(user.getPassword());

    }

    public  void removeUser(long id) {
        User userById = findUserById(id);
        if(userById == null){
            System.out.println("User not found by id: " +   id);
            return;
        }
        boolean isDeleted = false;
        int userIndex = 0;
        for (int index = 0; index < users.length; index++) {
            if (users[index].getId() == id) {
                users[index] = null;
                count--;
                userIndex = index;
                isDeleted = true;
            }
        }
        if (isDeleted) {
            User user = users[count + 1];
            users[userIndex] = user;
            users[count + 1] = null;
        }
    }

    public User findUserById(long id) {
        for (int i = 0; i < count; i++) {
            if (users[i].getId() == id) {
                return users[i];
            }
        }
        return null;
    }
    public User findUserByEmail(String email) {
        for (int i = 0; i < count; i++) {
            if (users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        return null ;
    }


}
