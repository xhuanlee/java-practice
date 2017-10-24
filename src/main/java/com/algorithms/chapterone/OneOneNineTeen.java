package com.algorithms.chapterone;

import com.algorithms.bookcode.StdIn;
import com.algorithms.bookcode.StdOut;

import java.util.Date;

/**
 * Created by lxh on 2017/10/24.
 */
public class OneOneNineTeen {

    public static void main(String[] args) {
        StdOut.print("请输入循环次数：");
        int n = StdIn.readInt();
        long startTime = new Date().getTime();
        // n == 50 总共耗时：96766 ms
//        for (int i = 0; i < n; i++) {
//            StdOut.println(i + ": " + fibonacci(i));
//        }

        // n == 50 总共耗时：0 ms
        StdOut.println(fibonacciByArray(50));

        long endTime = new Date().getTime();

        StdOut.println("总共耗时：" + (endTime - startTime) + " ms");
    }

    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * 用数组保存速度提升：n = 50 时，时间由 96766 ms -> 0 ms，就是说几乎可以忽略不计
     * @param n
     * @return
     */
    public static long fibonacciByArray(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            if (i > 1) {
                array[i] = array[i - 2] + array[i - 1];
            } else {
                array[i] = i;
            }
        }

        return array[n - 1];
    }

}
