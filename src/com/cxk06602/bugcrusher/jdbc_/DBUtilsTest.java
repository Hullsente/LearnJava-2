package com.cxk06602.bugcrusher.jdbc_;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import java.sql.Connection;
import java.util.List;

public class DBUtilsTest<V, K, M> {
    static void main() throws SQLException {
        Connection connect = JDBCUtils.connect();
        QueryRunner queryRunner = new QueryRunner();
        List<Employ> query = queryRunner.query(connect,"SELECT * FROM db01.emp", new BeanListHandler<>(Employ.class));
        for (Employ employ : query) {
            System.out.println(employ);
        }
        ArrayList<Employ> employs = new ArrayList<>();
        JDBCUtils.close(connect, null, null);

    }
}
