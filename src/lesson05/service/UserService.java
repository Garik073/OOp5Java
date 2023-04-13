package lesson05.service;
import java.util.List;

import lesson05.model.User;

public interface UserService {
     void saveUser(User user);

     void removeUser(User user);

     void updateUser(int index, User user);
     
     void salaryWriteOff(int index, User salary);

     List<User> getUserList();

     void salaryWriteOff(int index, int salary);
}

