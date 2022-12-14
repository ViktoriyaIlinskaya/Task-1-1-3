package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    public static final String LOGIN = "postgres";
    public static final String PASSWORD = "postgres";

    public static Connection getConnectionDataBase() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            if (con != null) {
                System.out.println("База данных подключена");
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
        return con;
        }
    }
