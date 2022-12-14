package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.dropUsersTable();
        userService.createUsersTable();
        userService.saveUser("Vasya","Pypkin", (byte) 20);
        userService.saveUser("Dima","Kovalov", (byte) 22);
        userService.saveUser("Nastya","Sidorova", (byte) 22);
        userService.saveUser("Katya","Ivanova", (byte) 127);
        List<User> user = userService.getAllUsers();
        for (User person: user) {
            System.out.println(person);
        }
        userService.cleanUsersTable();

    }
}
