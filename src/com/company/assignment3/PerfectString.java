package com.company.assignment3;
import java.util.Scanner;

public class PerfectString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abba");
        System.out.println(count(sb));
    }

    public static int count( StringBuilder sb){
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            String s = "" +sb.charAt(i);
            if(s.equals("a")){
                count++;
            }
        }
        count = count>sb.length()-count?count:sb.length()-count;

        return count +2;

    }
}
