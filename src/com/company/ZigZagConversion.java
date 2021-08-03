package com.company;

import java.util.ArrayList;

public class ZigZagConversion {
    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        System.out.println(convert(s,4));
    }
    public static String convert(String s, int numRows) {
        if (numRows==1) return s;
        StringBuilder result= new StringBuilder();
        ArrayList<StringBuilder> dummyList=new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            dummyList.add(new StringBuilder());
        int counter=0;
        int coefficient=1;

        for (int i = 0; i <s.length() ; i++) {
            if (counter==0) coefficient=1;
            if (counter==numRows-1) coefficient=-1;
            dummyList.get(counter).append(s.charAt(i));
            counter=coefficient+counter;
        }
        for (StringBuilder a:dummyList
             ) {
            result.append(a);
        }
        return result.toString();
    }
}
