package com.company;

public class Sqrtx {
    public static void main(String[] args) {
        int x = 2147395600;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        if (x == 1) return 1;
        long lowerBound = 0;
        long upperBound = x;
        int prev = 0;
        while (true) {
            long control = (lowerBound + upperBound) / 2;
            if ((int) control == prev) break;
            if (control * control <= x) {
                lowerBound = control;
            } else {
                upperBound = control;
            }
            prev = (int) control;
        }
        return prev;
    }
}
