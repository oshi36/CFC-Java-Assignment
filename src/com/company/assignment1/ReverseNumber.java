package com.company.assignment1;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter number to get its reverse");

        int number = new Scanner(System.in).nextInt() ;
        int reverse  = reverse(number);
        System.out.println("Reverse of number " + number+" is "+reverse);
    }
    public static  int reverse(int number){
        int reverse = 0;
        int remainder = 0;

        while (number!=0){
            remainder = number%10;
            reverse = reverse *10 + remainder;
            number /=10;
        }
        return  reverse;
    }
}
