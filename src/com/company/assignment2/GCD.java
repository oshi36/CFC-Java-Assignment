package com.company.assignment2;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find their GCD");
        a = sc.nextInt();
        b = sc.nextInt();
        int res =gcd(a,b);
        System.out.println(res);
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
