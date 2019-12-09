package com.zhujie.test;

/**
 * 注解
 * <p>
 * 1)查看注解
 * 2)自定义注解
 */

@TestZhuJie("demo_table")
public class demo01 {
    /**
     * 生成注解字段
     */
    @zhujieField(comment = "用户名字段", length = 10)
    private String username;

    /**
     * 生成注解字段
     */
    @zhujieField(comment = "邮箱字段", length = 4)
    private String email;

    private static void main(String[] args) {
    }
}
