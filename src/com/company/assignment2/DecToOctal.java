package com.company.assignment2;
import java.util.Scanner;
public class DecToOctal {
    public static void main(String[] args) {
        
        System.out.println("Enter decimal number for octal conversion");
        int num = new Scanner(System.in).nextInt() ;
        
        toOctal(num);
    }

    public static void toOctal(int num){
        int rem ;
        String result = "";

        char digit[] = {'0','1','2','3','4','5','6','7'};
        while (num > 0){
            rem = num%8;
            result = digit[rem]+result;
            num/=8;
        }
        System.out.println("Octal conversion is "+ result);
    }
}
