package com.example.cangjianleetcode.number;


/**
 * @description: lt 264
 * @author: lin.guo
 * @create: 2020-08-19 10:34
 **/
public class UglyTwo {
    public static int[] nums = new int[1690];

    static class UglyTwo1{
        public UglyTwo1() {
            nums[0] = 1;
            int ugly, i2=0, i3=0, i5=0;
            for (int i = 0;i<1690;i++){
                ugly = Math.min(Math.min(nums[i2]*2,nums[i3]*3),nums[i5]*5);
                nums[i] = ugly;
                if(ugly == nums[i2]*2) i2++;
                if(ugly == nums[i3]*3) i3++;
                if(ugly == nums[i5]*5) i5++;
            }
        }
    }

    public int nthUglyNumber(int n) {
        UglyTwo1 uglyTwo1= new UglyTwo1();
        return nums[n-1];
    }

}
