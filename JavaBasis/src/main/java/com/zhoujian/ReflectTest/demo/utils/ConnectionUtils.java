package com.zhoujian.ReflectTest.demo.utils;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class ConnectionUtils {
    private ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 获取当前线程的连接
     * @return
     */
    public Connection getThreadConnection(){
        //获取线程上连接
        try {
            Connection connection = threadLocal.get();
            if(connection ==null){
                connection = dataSource.getConnection();
                threadLocal.set(connection);
            }
            return connection;
        } catch (SQLException e) {
            throw  new RuntimeException(e);
        }
    }

    public void removeConnection(){
        threadLocal.remove();
    }
}
