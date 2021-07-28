package com.company;

import java.util.Arrays;

public class AddBinary {
    public static void main(String[] args) {
        String a = "11011"; String b = "1";
        //addBinary(a,b);
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        String shortString=a;
        String longString=b;
        StringBuilder result= new StringBuilder();
        int carry=0;
        if (a.length()>b.length()){
            shortString=b;
            longString=a;
        }
        int j=shortString.length()-1;
        int i=longString.length()-1;
        for (; i >=0 ; i--,j--) {
            if (j>=0){
                result.append((Character.getNumericValue(longString.charAt(i)) + Character.getNumericValue(shortString.charAt(j)) + carry) % 2);
                carry=(Character.getNumericValue(longString.charAt(i))+Character.getNumericValue(shortString.charAt(j))+carry)/2;
            }else if (carry==1){
                result.append((Character.getNumericValue(longString.charAt(i)) + carry) % 2);
                carry=(Character.getNumericValue(longString.charAt(i))+carry)/2;
            }else{
                return longString.substring(0,i+1)+result.reverse();
            }

        }
        return carry == 1 ? carry + result.reverse().toString() : result.reverse().toString();
    }
}
