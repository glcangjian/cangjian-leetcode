package com.example.cangjianleetcode.dynamicPlan;

/**
 * @功能名称: 动态规划、简单（面试题42）
 * @文件名称：dp1.java
 * @Date: 2020/3/9 9:55 PM
 * @Author: linxin.guo
 **/

/**
 * 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 *
 * 要求时间复杂度为O(n)。
 * 示例1:
 *
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

 */
public class dp1 {
    // 贪心解法 + 动态
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            //如果sum小于0，则之前的子序列全不要，从当前开始；大于0则要
            if (sum <= 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            //更新最大值
            if (sum > max){
                max = sum;
            }
        }
        return max;
    }
}
