package com.company;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] nums={1,3,5,6};
        System.out.println(searchInsert(nums,0));
    }

    public static int searchInsert(int[] nums, int target) {
        int i=0;
        for (; i < nums.length; i++) {
            if (nums[i]>=target) {
                return i;
            }
        }
        return i;
    }
}
