package com.example.cangjianleetcode.number;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 三数之和
 * https://leetcode-cn.com/problems/3sum/
 * @author: lin.guo
 * @create: 2020-09-10 15:40
 **/
public class ThreeSum {
    /**
     * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
     * 使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
     * 注意：答案中不可以包含重复的三元组。
     */
    public List<List<Integer>> threeSum(int[] nums) {
        //暴力解法
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int x = j + 1; x < nums.length; x++) {
                    if (nums[i]+nums[j]+nums[x] == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(i);
                        list.add(j);
                        list.add(x);
                        lists.add(list);
                    }
                }
            }
        }
        return lists;
    }
}
