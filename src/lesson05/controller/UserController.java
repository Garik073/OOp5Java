package lesson05.controller;
import java.util.List;

import lesson05.model.User;
import lesson05.service.UserService;
import lesson05.service.UserServiceImpl;

public class UserController {
    private UserService userService = new UserServiceImpl();

    public void saveUser(String name, int age, int salary) {
        userService.saveUser(new User(name, age, salary));
    }

    public void removeUser(User user) {
        userService.removeUser(user);
    }

    public void updateUser(int index, User user) {
        userService.updateUser(index, user);
    }

    public void salaryWriteOff(int index, User salary){
        userService.salaryWriteOff(index, salary);
    }

    public List<User> getUserList() {
        return userService.getUserList();
    }
}

