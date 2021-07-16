package com.company;

import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
       int [] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
       removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> noDuplicate = new ArrayList<>();
        int counter=0;
        for (int i = 0; i < nums.length; i++) {
            if (!noDuplicate.contains(nums[i])) {
                noDuplicate.add(nums[i]);
                int dummy=noDuplicate.get(counter);
                nums[counter]=dummy;
                counter++;
            }

        }
        return noDuplicate.size();
    }
}
