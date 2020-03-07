package com.example.cangjianleetcode.recursion;

/**
 * @功能名称: 面试题10-1，斐波那契数列 递归 简单
 * @文件名称：Fibonacci.java
 * @Date: 2020/3/8 10:37 PM
 * @Author: linxin.guo
 **/

/**
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1
 */
public class Fibonacci {

    /*// 递归解法，n过大时会超时
    public int fib(int n){
        if (n < 2){
            return n;
        }
        return fib(n-1)+fib(n-2) ;
    }*/

    /*// 迭代解法 考虑int溢出的问题
    public int fib(int n) {
        int a = 0, b = 1,c = 0;
        if (n <= 1){
            return n;
        }
        for (int i=2; i<=n;i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }*/
    // 动态规划解法 时间和空间都是O(n)
    public int fib(int n) {
        int[] dp = new int[n + 1];
        return dp(dp, n);
    }

    public int dp(int[] dp, int n) {
        if (n < 2)
            return n;
        if (dp[n] == 0)
            dp[n] = dp(dp, n - 1) + dp(dp, n - 2);
        return dp[n];
    }
    //还有一种矩阵快速幂，log(N);




}
