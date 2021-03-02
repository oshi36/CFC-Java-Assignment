package com.company.assignment3;
import java.util.Scanner;

public class CharReplace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        System.out.println(replace(str));
    }

    public static String replace(String str){
        StringBuilder sb = new StringBuilder(str);
        str ="";
        for (int i = 0; i < sb.length(); i++) {
            if(i%2==0){
                char c = sb.charAt(i);
                int n =(int)c + 1;
                c = (char)n;
                str = str + c;

            }else {
                char c = sb.charAt(i);
                int n =(int)c - 1;
                c = (char)n;
                str = str + c;

            }


        }
        return str;

    }

}
