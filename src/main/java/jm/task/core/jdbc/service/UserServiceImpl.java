package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl extends UserDaoJDBCImpl implements UserService {
     UserDaoJDBCImpl use = new UserDaoJDBCImpl();

    public void createUsersTable() {
        use.createUsersTable();

    }

    public void dropUsersTable() {
        use.dropUsersTable();

    }

    public void saveUser(String name, String lastName, byte age)  {
        use.saveUser(name,lastName,age);

    }


    public void removeUserById(long id) {
        use.removeUserById(id);

    }

    public List<User> getAllUsers() {
        return use.getAllUsers();
    }

    public void cleanUsersTable() {
        use.cleanUsersTable();


    }
}
