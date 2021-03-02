package com.company.assignment2;
import java.util.Scanner;
//import java.util.Arrays;

public class ArrayPrimeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter ten array elements");
        for (int i =0 ;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int result = countPrime(arr);
        System.out.println("Total Prime numbers in array are :"+result);
    }

    public static int countPrime(int[] arr){
        int numberPrime = 0;
        for (int i =0;i< arr.length;i++){
            if(checkPrime(arr[i])){
                numberPrime++;
            }
        }
        return numberPrime;
    }
    public static boolean checkPrime(int number){
        if (number < 2){
            return false;
        }
        for (int d=2;d<number;d++){
            if (number%d==0){
                return false;
            }
        }
        return true;
    }




    }

