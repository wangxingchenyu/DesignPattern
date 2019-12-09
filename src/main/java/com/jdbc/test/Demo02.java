package com.jdbc.test;

import java.sql.*;

/**
 * 数据库的引擎必须是innodb
 */

public class Demo02 {
    PreparedStatement preparedStatement = null;
    Connection connection = null;
    Statement statement = null;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Demo02 demo02 = new Demo02();
        demo02.connect();
    }

    public void connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdjk?useSSL=false", "root", "kkk");
        // 关闭默认提交
        connection.setAutoCommit(false);
        statement = (Statement) connection.createStatement();

        try {
            String sql = "insert into jdjk_java(name,age) values('alex',10)";
            statement.execute(sql);
            System.out.println("第一条数据插入完成");
            Thread.sleep(3000);
            String sql2 = "insert into jdjk_java(name,age) values('alex',10)";
            statement.execute(sql2);
            System.out.println("第二条数据也插入完成");

            connection.commit();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("第二条数据出错，滚动成功");
            connection.rollback();
        } finally {
            // 关闭连接
            statement.close();
            connection.close();
        }
    }
}
