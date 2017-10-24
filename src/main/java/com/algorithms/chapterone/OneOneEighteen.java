package com.algorithms.chapterone;

import com.algorithms.bookcode.StdOut;

/**
 * Created by lxh on 2017/10/23.
 */
public class OneOneEighteen {

    public static void main(String[] args) {
        StdOut.println(mystery(2, 25)); // 50
        StdOut.println(mystery(3, 11)); // 33
        StdOut.println(mystery(11, 12)); // 132

        StdOut.println(mystery2(2, 25)); // 33554432
        StdOut.println(mystery2(3, 11)); // 177147
        StdOut.println(mystery2(3, 5));
    }

    // a * b
    public static int mystery(int a, int b) {
        if (b == 0) {
            return 0;
        }

        if (b % 2 == 0) {
            return mystery(a + a, b / 2);
        }

        return mystery(a + a, b / 2) + a;
    }

    // a^b
    public static int mystery2(int a, int b) {
        if (b == 0) {
            return 1;
        }

        if (b % 2 == 0) {
            return mystery2(a * a, b / 2);
        }

        return mystery2(a * a, b / 2) * a;
    }

}
