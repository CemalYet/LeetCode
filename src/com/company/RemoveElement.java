package com.company;

public class RemoveElement {
    public static void main(String[] args) {
      int [] nums={4,5};
      removeElement(nums,5);
        for (int num : nums) {
            System.out.println(num);
        }

       // System.out.println(removeElement(nums,3));

    }
    public static int removeElement(int[] nums, int val) {
        int count=1;
        int temp;
        int answer=0;
        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i]==val && val==nums[i+1]){
                count++;
            }
            if (nums[i]==val && val!=nums[i+1]){
                temp=nums[i+1];
                nums[i+1]=nums[i+1-count];
                nums[i+1-count]=temp;
            }

        }
        for (int num : nums) {
            if (num == val) {
                answer++;
            }
        }
        answer= nums.length-answer;
        return answer;
    }
}
