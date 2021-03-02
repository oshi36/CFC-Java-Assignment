package com.company.assignment2;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        int a ,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
     //   int gcdres = gcd(a ,b);
        int lcm =(a*b)/gcd(a,b);
        System.out.println(lcm);
    }

    public static int gcd(int a ,int b){
        int res = 1;
        for (int i = 1 ;i<=a && i<= b;i++){
            if (a%i==0 && b%i==0){
                res = i;
            }
        }
        return res;
    }
}
