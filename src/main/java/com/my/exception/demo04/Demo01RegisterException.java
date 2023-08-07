package com.my.exception.demo04;

import java.util.Scanner;

/**
 * 要求：模拟注册操作，如果用户名已经存在，则抛出异常并提醒：该用户名已经被注册
 * <p>
 * 分析：
 * 1.使用数组保存已经注册的用户名（数据库）
 * 2.使用Scanner获取用户输入的注册的用户名（前端页面）
 * 3.定义一个方法，对用户输入的用户名进行判断
 * 遍历存储用户名的数组，进行比较
 * true：
 * 用户已经存在，抛出RegisterException异常
 * flase：
 * 继续遍历比较
 * 如果循环结束，未找到重复的用户名，提示注册成功。
 */
public class Demo01RegisterException {
    static String[] usernames = {"张三", "李四", "王五"};

    public static void main(String[] args) throws RegisterException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要注册的用户名");
        String username = sc.next();
        checkUsername(username);
    }

    /**
     * 定义一个方法，对用户输入的用户名进行判断
     *
     * @param username：用户输入的用户名
     * @throws RegisterException：自定义注册异常
     */
    public static void checkUsername(String username) throws RegisterException {
        //遍历存储已经注册过用户名的数组，获取每一个用户名
        for (String name : usernames) {
            if (name.equals(username)) {
                throw new RegisterException("该用户名已经被注册");
            }
        }
        System.out.println("注册成功");
    }

}
