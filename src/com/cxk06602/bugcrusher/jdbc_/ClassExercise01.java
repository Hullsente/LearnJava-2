package com.cxk06602.bugcrusher.jdbc_;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class ClassExercise01 {
    static void main() throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/com/cxk06602/bugcrusher/jdbc_/sql.properties"));

        Class.forName(properties.getProperty("driver"));
        Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("password"));
        Statement statement = connection.createStatement();
        statement.execute("DROP TABLE db01.actor");
        statement.execute("USE db01");
        statement.execute("CREATE TABLE actor(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(16))");
        statement.execute("INSERT INTO actor(name) VALUES('小明')");
        statement.execute("INSERT INTO actor(name) VALUES('小华')");
        statement.execute("INSERT INTO actor(name) VALUES('小刚')");
        statement.execute("INSERT INTO actor(name) VALUES('小红')");
        statement.execute("INSERT INTO actor(name) VALUES('小燕')");
        statement.execute("UPDATE actor SET name = 'cxk06602' WHERE id = 1");
        statement.execute("DELETE FROM actor WHERE id = 3");
        ResultSet resultSet = statement.executeQuery("SELECT * FROM actor");
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2));
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
