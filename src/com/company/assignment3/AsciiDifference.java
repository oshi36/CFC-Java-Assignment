package com.company.assignment3;
import java.util.Scanner;

public class AsciiDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        System.out.println(asciiDiff(str));
    }


    public static String asciiDiff(String str){
        StringBuilder sb = new StringBuilder(str);
        str = "" + str.charAt(0);
        for (int i = 1; i < sb.length(); i++) {

            char c = sb.charAt(i);
            char d = sb.charAt(i-1);
            int n =(int)c ;
            int g = (int)d;
            n = n-g;
            str = str + n +c;

        }
        return str;
    }
}
