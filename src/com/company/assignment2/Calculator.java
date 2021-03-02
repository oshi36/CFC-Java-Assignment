package com.company.assignment2;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 , n2 ;
        char ch;
        System.out.println("Enter two numbers  : ");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        System.out.println("Enter an operator ( + , - , * , / , % ) : ");
        ch = sc.next().charAt(0);
        double result  = 0 ;

        switch (ch){
            case '+':
                result = n1 + n2;
                break;

            case '-':
                result = n1 - n2;
                break;

            case '*':
                result = n1 * n2;
                break;

            case '/':
                result = n1 / n2;
                break;

            case '%':
                result = n1 % n2;
                break;
            default:
                System.out.println("Wrong input!!");
                return;
        }
        System.out.println("Result is :");
        System.out.println(n1 + " "+ ch +" "+ n2 + " = "+result);

    }
}
