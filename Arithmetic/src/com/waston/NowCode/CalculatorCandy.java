package com.waston.NowCode;

import java.util.Scanner;

/**
 * @Description: 计算糖果
 * A,B,C三个人是好朋友,每个人手里都有一些糖果,我们不知道他们每个人手上具体有多少个糖果,但是我们知道以下的信息：
 * A - B, B - C, A + B, B + C. 这四个数值.每个字母代表每个人所拥有的糖果数.
 * 现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。这里保证最多只有一组整数A,B,C满足所有题设条件。
 * 输入描述：
 * 输入为一行，一共4个整数，分别为A - B，B - C，A + B，B + C，用空格隔开。 范围均在-30到30之间(闭区间)。
 * 输出描述：
 * 输出为一行，如果存在满足的整数A，B，C则按顺序输出A，B，C，用空格隔开，行末无空格。
 * 如果不存在这样的整数A，B，C，则输出No
 *
 * 示例1:
 * 输入
 * 1 -2 3 4
 * 输出
 * 2 1 3
 * @Author: Waston
 * @Date: 2019/6/1 23:01
 */
public class CalculatorCandy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y1,y2,y3,y4;
        float a,b,c;
        while(in.hasNextInt()){
            y1 = in.nextInt();
            y2 = in.nextInt();
            y3 = in.nextInt();
            y4 = in.nextInt();
            // 根据题目给出的条件，可列出以下等式
            a = (y1 + y3) / 2f;
            b = (y3 - y1) / 2f;
            c = (y4 - y2) / 2f;
            // 不满足下面条件，即为不存在
            if(b != ((y2 + y4) / 2)){
                System.out.println("No");
                return;
            }
            // 满足约束条件，输出解
            System.out.println((int)a + " " + (int)b + " " +(int)c);
        }
    }
}
