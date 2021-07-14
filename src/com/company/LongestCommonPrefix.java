package com.company;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] strs = {"a"};
        System.out.println(longestCommonPrefix(strs));

    }
    public static String longestCommonPrefix(String[] strs) {
        //if (strs.length==1) return strs[0];
        int index=0,min=20;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length()<min){
                min= strs[i].length();
                index=i;
            }
        }
        String sreturn="";
        for (int i = 0; i <strs[index].length() ; i++) {
            int counter=0;
            char atChar = strs[index].charAt(0);
            for (int j = 0; j < strs.length; j++) {
                if (index !=j ) {
                   if (strs[index].charAt(i)== strs[j].charAt(i)){
                       counter++;
                       atChar=strs[index].charAt(i);
                   }else{
                       return sreturn;
                   }
                }
            }
            if (counter== strs.length-1){
                sreturn+=atChar;
            }
        }
        return sreturn;
    }
}
