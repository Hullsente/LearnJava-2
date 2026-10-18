package com.cxk06602.bugcrusher.jdbc_;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DruidUtilsTest {
    static void main() {
        Connection connection = DruidUtils.connection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM db01.emp");
            resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                for (int i = 1; i <= 8; i++) {
                    System.out.print(resultSet.getObject(i) + "\t\t\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DruidUtils.close(connection, preparedStatement, resultSet);
        }

    }
}
