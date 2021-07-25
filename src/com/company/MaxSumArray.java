package com.company;

public class MaxSumArray {
    public static void main(String[] args) {
       int [] nums = {-2};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int maxSum=-1000;
        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for (int j = i; j < nums.length ; j++) {
                sum+=nums[j];
                if (sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        return maxSum;
    }
}
