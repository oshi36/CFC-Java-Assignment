package com.company.assignment2;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        num = sc.nextInt();
        int res = reverseInt(num);
        System.out.println(res);

    }

    public static int reverseInt(int num) {
        int res = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            res = res * 10 + rem;
        }
        return res;
    }
}

