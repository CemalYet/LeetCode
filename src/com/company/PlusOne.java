package com.company;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int [] digits={9,9};

        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        int i=0;
        if (digits[digits.length-1]==9){
            for (i = digits.length-1; i>=0; i--) {
                if (digits[i]==9){
                    digits[i]=0;
                }else{
                    digits[i]+=1;
                    break ;
                }

            }
        }else{
            digits[digits.length-1]=digits[digits.length-1]+1;
        }
        if (i == -1){
            int [] newArray=new int[digits.length+1];
            newArray[0]=1;
            for (int j = 0; j < digits.length ; j++) {
                newArray[j+1]=digits[j];
                return newArray;
            }
        }
        return digits;
    }
}
