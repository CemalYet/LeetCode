package com.company;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }
    public static boolean isValid(String s) {
        if (s.length()==1 || s.length()==0) return false;
        Stack<Character> parentheses = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) =='{'|| s.charAt(i) =='[' ){
                parentheses.push(s.charAt(i));
            }else {
                if (parentheses.size()==0) return false;
                if (s.charAt(i)==')' && parentheses.peek() == '(') {
                    parentheses.pop();
                }else if (s.charAt(i)=='}' && parentheses.peek() == '{'){
                    parentheses.pop();
                }else if (s.charAt(i)==']' && parentheses.peek() == '['){
                    parentheses.pop();
                }else {
                    return false;
                }
            }
        }
        if (parentheses.size()>0) return false;
        return true;
    }
}
