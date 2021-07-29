package com.company;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(43));
    }
    public static int climbStairs(int n) {
        if(n<3) return n;
        int first=1;
        int second=2;
        int current;
        for (int i = 2; i <n ; i++) {
            current=first+second;
            first=second;
            second=current;
        }
        return second;
    }
}
