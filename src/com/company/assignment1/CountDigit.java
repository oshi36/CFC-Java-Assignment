package com.company.assignment1;
import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        int num , count = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        
        while (num != 0) {
            num /= 10;
            ++count;
        }
        System.out.println("Number of digits are :"+count);
    }
}
