package com.company;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("b"));
    }
    public static  String longestPalindrome(String s) {
        int max=0;
        String palindrome="";
        String dummy="";
        //StringBuilder dummy= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            dummy+=s.charAt(i);
            for (int j = i+1; j <s.length() ; j++) {
                dummy+=s.charAt(j);
                //System.out.println(dummy);
                StringBuilder reverse= new StringBuilder(dummy);
                if (dummy.compareTo(reverse.reverse().toString())==0 && dummy.length()>max){
                    max=dummy.length();
                    palindrome=dummy;
                   // System.out.println(palindrome);
                }
            }
            dummy="";
        }
       return palindrome.compareTo("")==0 ? String.valueOf(s.charAt(0)) :palindrome;
    }
}
