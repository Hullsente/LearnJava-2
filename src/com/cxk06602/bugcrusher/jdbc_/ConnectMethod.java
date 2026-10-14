package com.cxk06602.bugcrusher.jdbc_;

import com.mysql.cj.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectMethod {
    @Test
    public void connect01() throws Throwable {
        Driver driver = new Driver();
        Properties properties = new Properties();
        properties.setProperty("user", "cxk06602");
        properties.setProperty("password", "123");
        String connect_url = "jdbc:mysql://localhost:3306/testbd";
        Connection connect = driver.connect(connect_url, properties);
    }
    @Test
    public void connect02() throws Throwable {
        Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) aClass.getDeclaredConstructor().newInstance();
        Properties properties = new Properties();
        properties.setProperty("user", "cxk06602");
        properties.setProperty("password", "123");
        String connect_url = "jdbc:mysql://localhost:3306/testbd";
        Connection connect = driver.connect(connect_url, properties);
    }
    @Test
    public void connect03() throws Throwable {
        Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) aClass.getDeclaredConstructor().newInstance();
        String connect_url = "jdbc:mysql://localhost:3306/testbd";
        DriverManager.registerDriver(driver);
        DriverManager.getConnection(connect_url, "cxk06602", "123");
    }
    @Test
    public void connect04() throws Throwable {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testbd", "cxk06602", "123");
    }
    @Test
    public void connect05() throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\com\\cxk06602\\bugcrusher\\jdbc_\\sql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);
    }
}
