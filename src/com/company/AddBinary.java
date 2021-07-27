package com.company;

import java.util.Arrays;

public class AddBinary {
    public static void main(String[] args) {
        String a = "001"; String b = "1110";
        //addBinary(a,b);
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        int shortString=b.length()-1;
        int longString=a.length()-1;
        String result="";
        int carry=0;
        if (a.length()<b.length()){
            shortString=a.length()-1;
            longString=b.length()-1;
        }
        for (int i = shortString; i >=0 ; i--) {
            System.out.println((Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(i))+carry)%2);
            result+=(Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(i))+carry)%2;
            carry=(Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(i))+carry)/2;
        }


        //System.out.println(result);
        return carry == 1 ? result + carry : result;
    }
}
