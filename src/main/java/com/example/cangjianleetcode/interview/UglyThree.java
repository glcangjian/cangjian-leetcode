package com.example.cangjianleetcode.interview;

/**
 * @description:
 * @author: lin.guo
 * @create: 2020-08-19 14:27
 * 输入：n = 3, a = 2, b = 3, c = 5
 * 输出：4
 * 解释：丑数序列为 2, 3, 4, 5, 6, 8, 9, 10... 其中第 3 个是 4。
 **/
public class UglyThree {
    public int nthUglyNumber(int n, int a, int b, int c) {
        int[] nums = new int[n+1];
        int ugly, i2 = 0, i3 = 0, i5 = 0, index = 1;
        nums[0] = 1;
        while (index <= n) {
            ugly = Math.min(Math.min(nums[i2]*a,nums[i3]*b),nums[i5]*c);
            nums[index++] = ugly;
            if (ugly == nums[i2]*a) i2++;
            if (ugly == nums[i3]*b) i3++;
            if (ugly == nums[i5]*c) i5++;
        }
        return nums[n];
    }

    public static void main(String[] args) {

    }
}
