package org.zyw.utils;

/**
 * @Description 数组工具类
 * @Author zouyaowen
 * @Date 2019/7/7 0:52
 */
public class ArrayUtils {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        // 数组最大的优点是：快速查询
        // 数组最好的使用场景是：索引有语意
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
