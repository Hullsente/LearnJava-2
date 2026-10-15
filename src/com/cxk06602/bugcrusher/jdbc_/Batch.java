package com.cxk06602.bugcrusher.jdbc_;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Batch {
    static void main() throws Exception {
        Connection connect = JDBCUtils.connect();
        PreparedStatement preparedStatement = connect.prepareStatement("INSERT INTO db01.table03 VALUES(?, ?, SHA2(?, 512))");
        for (int i = 0; i < 990 * 10; i++) {
            preparedStatement.setInt(1, i + 1);
            preparedStatement.setString(2, i * 2 + 1 + "");
            preparedStatement.setString(3, (i * 7 - 1 ^ i) + "");

            preparedStatement.addBatch();
            if((i + 1) % 990 == 0){
                preparedStatement.executeBatch();
                preparedStatement.clearBatch();
            }
        }

        JDBCUtils.close(connect, preparedStatement, null);

    }
}
