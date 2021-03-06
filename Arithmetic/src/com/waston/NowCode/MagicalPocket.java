package com.waston.NowCode;

import java.util.Scanner;

/**
 * @Description: 神奇的口袋
 * 有一个神奇的口袋，总的容积是40，用这个口袋可以变出一些物品，这些物品的总体积必须是40。
 * John现在有n个想要得到的物品，每个物品的体积分别是a1，a2……an。John可以从这些物品中选择一些，
 * 如果选出的物体的总体积是40，那么利用这个神奇的口袋，John就可以得到这些物品。现在的问题是，John有多少种不同的选择物品的方式。
 * 输入描述：
 * 输入的第一行是正整数n (1 <= n <= 20)，表示不同的物品的数目。接下来的n行，
 * 每行有一个1到40之间的正整数，分别给出a1，a2……an的值。
 * 输出描述：
 * 输出不同的选择物品的方式的数目。
 *
 * 示例1:
 * 输入
 * 3
 * 20
 * 20
 * 20
 * 输出
 * 3
 *
 *
 *
 * 【解题思路】： 采用递归思想： ①物品n个，物品体积逐一放入weight[]中 ②递归函数count(int s,int n) : 其
 * 中s为剩余物品重量，n为剩余可选的物品个数
 * 则分以下两步递归求解：
 * a.从后往前装，装上weight[n]后，若剩余物品仍然有解
 * 则count(s-weight[n],n-1);
 * b.若装了weight[n]后，无解，则删除该包,尝试第n-1个
 * count(s,n-1);
 * @Author: Waston
 * @Date: 2019/6/1 17:38
 */
public class MagicalPocket {
    static int[] weight;
    static int count = 0;
    static int N;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            N = input.nextInt();
            weight = new int[N+1];

            for(int i = 1;i <= N;i++){
                weight[i] = input.nextInt();
            }

            count(40,N);
            System.out.println(count);
        }
    }

    public static void count(int s,int n){
        // 正好装满，跳出递归
        if (s == 0){
            ++count;
            return;
        }
        //是s<0或n<1则不能完成
        if(s<0 || (s>0 && n<1)){
            return;
        }

        count(s - weight[n],n-1);
        count(s,n-1);
    }
}
