package com.healchow.blog.post03;

/**
 * 这是关于变量的测试类
 * 变量: 在程序执行的过程中, 在某个范围内值会发生变化的量
 *
 * @author Heal Chow
 * @date: 2019/02/22 23:50
 */
public class Variable {

    public static void main(String[] args) {
        // 定义byte类型的变量
        byte b = 10;
        System.out.println(b);

        // 定义short类型的变量
        short s = 100;
        System.out.println(s);

        // 定义int类型的变量, 只要在使用变量之前完成赋值, 即可使用
        int i;
        i = 10000;
        System.out.println(i);

        // 同时定义多个变量, 并为它们赋值
        int ia = 10, ib = 20, ic = 30;

        // 定义long类型的变量
        long l = 1000000000000000L;
        System.out.println(l);

        // 定义float类型的变量
        float f = 12.34F;
        System.out.println(f);

        // 定义double类型的变量
        double d = 12.34;
        System.out.println(d);

        // 定义char类型的变量
        char c = 'a';
        System.out.println(c);

        // 定义boolean类型的变量
        boolean bb = false;
        System.out.println(bb);

        {
            int in = 100;
            System.out.println(in);
        }
        // System.out.println(in); // 这里变量in已经不存在了
    }
}
