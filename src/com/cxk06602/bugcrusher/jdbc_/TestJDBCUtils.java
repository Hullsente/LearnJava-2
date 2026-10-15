package com.cxk06602.bugcrusher.jdbc_;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJDBCUtils {
    static void main() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtils.connect();
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
        } finally {
            JDBCUtils.close(connection, preparedStatement, resultSet);
        }
    }
}
