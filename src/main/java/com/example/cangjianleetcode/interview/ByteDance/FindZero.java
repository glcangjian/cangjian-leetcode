package com.example.cangjianleetcode.interview.ByteDance;

/**
 * @功能名称: 牛科网 字节跳动真题
 * @文件名称：FindZero.java
 * @Date: 2020/3/10 8:53 PM
 * @Author: linxin.guo
 **/

import java.util.Scanner;

/**
 * Z国的货币系统包含面值1元、4元、16元、64元共计4种硬币，以及面值1024元的纸币。
 * 现在小Y使用1024元的纸币购买了一件价值为N（0<N<=1024）的商品，请问最少他会收到多少硬币？
 *
 * 输入描述:
 * 一行，包含一个数N。
 *
 * 输出描述:
 * 一行，包含一个数，表示最少收到的硬币数。
 *
 * 输入例子1:
 * 200
 *
 * 输出例子1:
 * 17
 *
 * 例子说明1:
 * 花200，需要找零824块，找12个64元硬币，3个16元硬币，2个4元硬币即可。
 */
public class FindZero {
    // 典型用贪心算法求解,这里的硬币大小如果不成倍数关系，就先存到list中，然后遍历
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int target = 1024 - N;
        int count =0;
        int val = 64;
        for (int i = 0; i < 4;i++){
            count += target/val;
            target %= val;
            val /= 4;
        }
        System.out.println(count);
    }
}
