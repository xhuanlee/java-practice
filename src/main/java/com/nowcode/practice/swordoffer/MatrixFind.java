package com.nowcode.practice.swordoffer;

/**
 * Created by xhuanlee on 2017/10/16.
 * 问题：
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 思路：
 * (借鉴)从二维数组左下角元素开始遍历，目标数大往右比较，目标数小往上比较，直至遍历完成。
 * @author xhuanlee
 */
public class MatrixFind {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4,5,6},
                {2,45,55,66,466,555},
                {54,57,90,89,565,666}
        };
        int target = 23;
        System.out.println(target + ": " +find(target, matrix));

        target = 45;
        System.out.println(target + ": " +find(target, matrix));

        target = 5454;
        System.out.println(target + ": " +find(target, matrix));

        target = 66;
        System.out.println(target + ": " +find(target, matrix));
    }

    public static boolean find(int target, int[][] matrix) {
        // 数组高度
        int y = matrix.length;
        // 数组宽度
        int x = matrix[0].length;
        int i = 0;
        int j = y - 1;
        int count = 0;
        while (i < x && j >= 0) {
            count++;
            int element = matrix[j][i];
            if (element == target) {
                return true;
            }
            if (element < target) {
                i++;
            } else {
                j--;
            }
        }

        return false;
    }

}
