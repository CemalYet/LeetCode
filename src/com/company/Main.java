package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));

    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int result = 0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            result = result + map.get(key);
            if (i + 1 == s.length()) {
                return result;
            }
            char nextKey = s.charAt(i + 1);
            if (key == 'I' && (nextKey == 'V' || nextKey == 'X')) {
                result = result - 2;
            } else if (key == 'X' && (nextKey == 'L' || nextKey == 'C')) {
                result = result - 20;
            } else if (key == 'C' && (nextKey == 'D' || nextKey == 'M')) {
                result = result - 200;
            }
        }
        return result;
    }

}


