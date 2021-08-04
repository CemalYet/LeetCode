package com.company;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 1};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int end = height.length - 1;
        int start = 0;
        int area;
        int maxArea = 0;
        while (start < end) {
            if (height[start] < height[end]) {
                area = (end - start) * height[start];
                start++;
            } else {
                area = (end - start) * height[end];
                end--;
            }
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}
