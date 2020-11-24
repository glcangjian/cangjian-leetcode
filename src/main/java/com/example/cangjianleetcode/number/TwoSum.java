package com.example.cangjianleetcode.number;

import java.util.HashMap;

/**
 * @description: 两数之和
 * https://leetcode-cn.com/problems/two-sum/
 * @author: lin.guo
 * @create: 2020-09-10 15:24
 **/
public class TwoSum {
    /**
     * 解法一：暴力，两个for循环,时间复杂度O(N*N)
     * 解法二：利用hash表将每次遍历的值和索引保存，利用空间换时间
     * 实现O(N)
     */
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i =0; i< nums.length;i++){
            if (map.containsKey(target-nums[i])){
                ret[0] = map.get(target-nums[i]);
                ret[1] = i;
                return ret;
            } else {
                map.put(nums[i],i);
            }
        }
        return ret;
    }

}
