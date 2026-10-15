package com.cxk06602.bugcrusher.jdbc_;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private static String user;
    private static String password;
    private static String url;
    private static String driver;
    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/com/cxk06602/bugcrusher/jdbc_/sql.properties"));
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            url = properties.getProperty("url");
            driver = properties.getProperty("driver");

            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection connect(){

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void close(Connection connection, Statement statement, ResultSet resultSet){
        try {
            if(statement != null)statement.close();
            if(resultSet != null)resultSet.close();
            if(connection != null)connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
