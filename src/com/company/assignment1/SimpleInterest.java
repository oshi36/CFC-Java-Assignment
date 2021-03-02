package com.company.assignment1;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        
        float princAmt , rate , time;
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter Principal Amount");
        princAmt = sc.nextFloat();
        System.out.println("Enter Interest Rate");
        rate = sc.nextFloat();
        System.out.println("Enter Time in years");
        time = sc.nextFloat();

        float simpleInterest = (princAmt * rate * time) / 100;
        sc.close();
        System.out.println("Simple Interest is "+ simpleInterest);
    }
}
