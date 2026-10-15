package com.cxk06602.bugcrusher.jdbc_;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class ClassExercise02 {
    static void main() throws ClassNotFoundException, IOException, SQLException {
        Scanner scanner = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/com/cxk06602/bugcrusher/jdbc_/sql.properties"));
        Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("password"));
        Statement statement = connection.createStatement();
        try {
            statement.executeUpdate("DROP TABLE db01.admit");
        } catch (SQLException _) {
        }
        statement.executeUpdate("USE db01");
        statement.executeUpdate("CREATE TABLE admit(id INT PRIMARY KEY AUTO_INCREMENT, username VARCHAR(16), password VARCHAR(128))");


        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO admit VALUES(NULL, ?, SHA2(?, 512))");
        for (int i = 0; i < 5; i++) {
            preparedStatement.setString(1, (char) ('A' + i) + "");
            int random = (int)(Math.random() * 900000 + 100000);
            System.out.println("偷偷告诉你，这对应行的密码是" + random);
            preparedStatement.setString(2, random + "");
            preparedStatement.executeUpdate();
        }
        preparedStatement = connection.prepareStatement("SELECT * FROM admit");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2));
        }
        System.out.println("----------");

        preparedStatement = connection.prepareStatement("UPDATE admit SET username = ? WHERE username = ? AND password = SHA2(?, 512)");
        System.out.println("请输入名称改变目标");
        preparedStatement.setString(2, scanner.next());
        System.out.println("请输入名称改变结果");
        preparedStatement.setString(1, scanner.next());
        System.out.println("请输入改变密码");
        preparedStatement.setString(3, scanner.next());
        int changeRow = preparedStatement.executeUpdate();
        System.out.println(changeRow > 0 ? "修改成功" : "修改失败");

        preparedStatement = connection.prepareStatement("SELECT * FROM admit");
        resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2));
        }
        System.out.println("----------");

        resultSet.close();
        preparedStatement.close();
        statement.close();
        connection.close();
    }
}
