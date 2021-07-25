package com.company;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "  ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        if (s == " ") return 0;
        String [] lastWord=s.split(" ");
        if (lastWord.length==0) return 0;
        return  lastWord[lastWord.length-1].length();
    }
}
