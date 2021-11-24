package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static String URL = "jdbc:mysql://localhost:3307/test";
    private static String userName = "root";
    private static String password = "qwe123";

    public static Connection getConn()  {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL,userName,password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

}
