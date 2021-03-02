package com.company.assignment2;
import java.util.Scanner;

public class CharCase {
    public static void main(String[] args) {
        char ch ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character to know whether its in lower or uppercase");
        ch = sc.next().charAt(0);

        toCheckCase(ch);
    }
   public static void toCheckCase(char ch){
        if (ch >= 'A' && ch<='Z'){
            System.out.println(ch+" is in uppercase");
        } else if (ch >= 'a'&& ch <= 'z'){
            System.out.println(ch+" is in lowercase");
        }else {
            System.out.println(ch+" is not an alphabetic character");
        }
    }
}
