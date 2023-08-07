package com.my.exception.demo02;

import java.io.IOException;

/**
 * try...catch:异常处理的第二种方式，自己处理异常
 * 注意：try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
 */
public class Demo01TryCatch {
    public static void main(String[] args) {
        try {
            readFile("d:\\a.tx");
        } catch (IOException e) {//try中抛出什么异常对象，catch就定义什么异常变量，用来接收这个异常对象
//            System.out.println("catch - 传递的文件后缀不是.txt");
            /**
             *  Throwable类中定义了3个异常处理的方法
             *  1. String getMessage()
             *  2. String toString()
             *  3. void printStackTrace() JVM打印异常对象，默认调用此方法
             */
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());//重写Object类的toString方法
            //System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("后续代码");
    }

    /**
     * 如果传递的路径不是.txt结尾
     * 那么我们就抛出IO异常对象，告知方法的调用者，文件的后缀名不对
     */
    public static void readFile(String fileName) throws IOException {

        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");

    }
}
