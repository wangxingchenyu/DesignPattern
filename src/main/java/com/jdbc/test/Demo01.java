package com.jdbc.test;

import java.sql.*;

public class Demo01 {
    public static void main(String[] args) {
        Connection con = null;
       //  Thread.State terminated = Thread.State.TERMINATED;
        Thread thread = new Thread();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                // 创建链接
                con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdjk?useSSL=false", "root", "kkk");
                PreparedStatement ps = con.prepareStatement("select * from jdjk_com where id < ?");
                ps.setInt(1, 10);
                ResultSet resultSet = ps.executeQuery();
                while (resultSet.next()) {
                    System.out.printf("业务名:%s,第一负责人名称: %s", resultSet.getString("yewu"), resultSet.getString("diyiname"));
                    System.out.println("----------------------------------");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void getFirstName(String name) {
        try {
            // 通过业务名称来查询整行数据

        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }


}
