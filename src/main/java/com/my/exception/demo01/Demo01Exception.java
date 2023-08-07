package com.my.exception.demo01;

/**
 * java.lang.Throwable类是Java语言中所有错误或异常的超类
 * Exception:编译器异常，进行编译（写代码） java程序出现的问题
 * RuntimeException:运行期异常，java程序运行过程中出现的问题
 * 异常就相当于程序得了一个小毛病，把异常处理掉，程序就可以继续执行。
 * Error:错误
 * 错误就相当于程序得了一个无法治愈的毛病，必须修改源代码，程序才能继续执行。
 */
public class Demo01Exception {
    public static void main(String[] args) {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//用来格式化日期
//        Date date = null;
//        try {
//            date = sdf.parse("1999-1112");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println(date);

//        int[] arr = {1,2,3};
////        System.out.println(arr[0]);
//        try {
//            //放入可能会出现异常的代码
//            System.out.println(arr[3]);
//        }catch (Exception e){
//            //出现异常后的处理逻辑
//            System.out.println(e);
//        }
        /**
         * Error:错误
         * OutOfMemoryError; Java heap space
         * 内存溢出的错误，创建的数组太大了，超出了JVM分配的内存
         */
        int[] arr = new int[1024 * 1024];
        //必须修改代码
        System.out.println("后续代码");
    }
}
