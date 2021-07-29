package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdvf"));
    }
    public static int lengthOfLongestSubstring(String s){
        Set<Character> dummy=new HashSet<>();
       //ArrayList<Character> dummy=new ArrayList<>();
        int i=0;
        int j=0;
        int max=0;

        while (i<s.length() && j<s.length()){
            if (!dummy.contains(s.charAt(i))){
                dummy.add(s.charAt(i));
                max=Math.max(max,i-j+1);
                i++;

            }else{
                dummy.remove(s.charAt(j));
                //dummy.remove(dummy.get(0));
                j++;
            }
        }
        return max;
    }
}
