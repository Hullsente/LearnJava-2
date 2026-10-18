package com.cxk06602.bugcrusher.jdbc_.basicdao.dao;

import com.cxk06602.bugcrusher.jdbc_.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BasicDAO<T> {
    QueryRunner queryRunner = new QueryRunner();

    //dml
    public int update(String sql, Object... params){
        Connection connection = DruidUtils.connection();
        try {
            return queryRunner.update(connection, sql, params);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<T> queryAll(String sql, Class<T> classType, Object... params){
        try(Connection connection = DruidUtils.connection()){
            return queryRunner.query(connection, sql, new BeanListHandler<T>(classType), params);
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    public T queryRow(String sql, Class<T> classType, Object... params){
        try(Connection connection = DruidUtils.connection()){
            return queryRunner.query(connection, sql, new BeanHandler<T>(classType), params);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    public Object queryObject(String sql, Object... params){
        try (Connection connection = DruidUtils.connection()) {
            return queryRunner.query(connection, sql, new ScalarHandler<>(), params);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
