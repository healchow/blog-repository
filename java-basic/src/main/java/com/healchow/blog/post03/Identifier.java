package com.healchow.blog.post03;

/**
 * 这是关于标识符的测试类
 * 标识符: 就是给包、类、方法、变量起名字的符号
 *
 * @author Heal Chow
 * @date: 2019/02/22 23:46
 */
public class Identifier {

    public static void main(String[] args) {
        // 定义变量
        int a = 10;
        // 正确
        int b2 = 20;
        
        // 下面这个错误: 不能以数字开头
        // int 2b = 30;

        // 下面这个错误: 不能是Java中的关键字
        // int public = 40;
    }

}
