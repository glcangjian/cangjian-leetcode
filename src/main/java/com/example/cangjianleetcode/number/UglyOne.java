package com.example.cangjianleetcode.number;

/**
 * @description: 丑数1（lt 263）
 * @author: lin.guo
 * @create: 2020-08-19 09:43
 **/
public class UglyOne {
    public boolean isUgly(int num) {
        if (num == 0){
            return false;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }
}
