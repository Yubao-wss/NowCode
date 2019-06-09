package com.waston.base;

/**
 * @Description: true
 *               true
 *               false
 *               true
 * 解析：https://www.cnblogs.com/tianwenmy/p/6431596.html
 * @Author: Waston
 * @Date: 2019/6/9 0:23
 */
public class IntegerAndInt {
    public static void main(String[] args) {
        Integer i01 = 59;
        int i02 = 59;
        Integer i03 = Integer.valueOf(59);
        Integer i04 = new Integer(59);
        System.out.println(i01 == i02);
        System.out.println(i01 == i03);
        System.out.println(i03 == i04);
        System.out.println(i02 == i04);
    }
}
