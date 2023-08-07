package com.my.exception.demo01;

/**
 * 异常的产生过程分析（分析异常是怎么样产生的，如何处理异常）
 */
public class Demo02Exception {
    public static void main(String[] args) {
        //创建int类型的数组，并赋值
        int[] arr = {1, 2, 3};
        int e = getElement(arr, 3);
        System.out.println(e);

    }

    /**
     * 定义一个方法，获取数组指定索引处的元素
     *
     * @param arr   自定义的int型数组
     * @param index 数组的索引
     * @return int型数据
     */
    public static int getElement(int[] arr, int index) {
        int ele = arr[index];
        return ele;
    }

}
