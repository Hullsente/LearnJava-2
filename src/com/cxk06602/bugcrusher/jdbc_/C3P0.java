package com.cxk06602.bugcrusher.jdbc_;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class C3P0 {
    static void main() throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("cxk06602_pool");
        for (int i = 0; i < 5000; i++) {
            Connection connection = comboPooledDataSource.getConnection();
            System.out.println("ok");
            connection.close();
        }
    }
}
