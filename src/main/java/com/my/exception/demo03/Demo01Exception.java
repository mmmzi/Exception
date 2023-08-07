package com.my.exception.demo03;

import java.util.ArrayList;
import java.util.List;

public class Demo01Exception {
    public static void main(String[] args) {
        /**
         * 多个异常使用捕获又该如何处理呢？
         * 1. 多个异常分别处理
         * 2. 多个异常一次捕获，多次处理
         * 3. 多个异常一次捕获，一次处理
         */
//1. 多个异常分别处理
//        try{
//            int[] arr = {1,2,3};
//            System.out.println(arr[3]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//
//        try {
//            List<Integer> list = new ArrayList<>();
//            list.add(1);
//            list.add(2);
//            list.add(3);
//            System.out.println(list.get(3));
//        }catch (IndexOutOfBoundsException e){
//            System.out.println(e);
//        }

//        2. 多个异常一次捕获，多次处理
//        注意：
//            一个try有多个catch：catch里面定义的的异常变量，如果有子父类关系，那么子类的异常变量必须写在上边，否则就会报错
//        try中如果出现了异常对象，会把异常对象抛出给catch处理，抛出的异常对象会从上到下依次赋值给catch中定义的异常变量
//        try{
//            int[] arr = {1,2,3};
//            //System.out.println(arr[3]);
//            List<Integer> list = new ArrayList<>();
//            list.add(1);
//            list.add(2);
//            list.add(3);
//            System.out.println(list.get(3));
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }catch (IndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//        System.out.println("后续代码");

//        3. 多个异常一次捕获，一次处理
        try {
            int[] arr = {1, 2, 3};
            //System.out.println(arr[3]);
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println(list.get(3));
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("后续代码");
    }
}
