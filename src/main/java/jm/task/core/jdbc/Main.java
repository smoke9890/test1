package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl use = new UserServiceImpl();
        use.createUsersTable();
        use.saveUser("Pavel","Khramov", (byte) 23);
        System.out.println("User с именем – Pavel добавлен в базу данных");

        use.saveUser("Andrey","Ali", (byte) 43);
        System.out.println("User с именем – Andrey добавлен в базу данных");

        use.saveUser("Alex","Sobolev", (byte) 13);
        System.out.println("User с именем – Alex добавлен в базу данных");

        use.saveUser("Ivan","Ivanov", (byte) 41);
        System.out.println("User с именем – Ivan добавлен в базу данных");
        System.out.println(use.getAllUsers());
        use.cleanUsersTable();
        use.dropUsersTable();

    }


    }


