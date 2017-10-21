package com.algorithms.chapterone;

import com.algorithms.bookcode.StdOut;

/**
 * Created by xhuanlee on 2017/10/21.
 */
public class PracticeOneOneSix {

    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }

}
