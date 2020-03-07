package com.example.cangjianleetcode.recursion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @功能名称:面试题08.06.汉诺塔 递归/分治，简单
 * @文件名称：Hanota.java
 * @Date: 2020/3/9 11:22 AM
 * @Author: linxin.guo
 **/
public class Hanota {

    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        int n = A.size();
        move(n, A, B, C);

    }

    public void move(int n, List<Integer> A, List<Integer> B, List<Integer> C) {
        if (n == 1) {
            C.add(A.get(A.size() - 1));//将A中数据移到C
            A.remove(A.size() - 1); //删除A中数据
            return;
        }
        move(n - 1, A, C, B); //先将上面数据移到由A移到B
        C.add(A.get(A.size() - 1));    // 将A中数据移到C
        A.remove(A.size() - 1);  //将A中数据删除
        move(n - 1, B, A, C);  //将B中数据移到C
    }

    public static void main(String[] args) {
        Hanota hanota = new Hanota();
        List<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();
        hanota.hanota(A, B, C);
        for (Iterator<Integer> it = C.iterator(); it.hasNext(); ) {
            Integer integer = it.next();
            System.out.println(integer);
        }
    }
}
