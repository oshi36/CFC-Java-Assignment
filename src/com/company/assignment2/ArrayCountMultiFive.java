package com.company.assignment2;
//import java.util.Arrays;
import java.util.Scanner;

public class ArrayCountMultiFive {

    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Array Elements");
        for (int  i =0 ;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        countMultiFive(arr);
    }

    public static void countMultiFive(int arr[]){
        int count =0;
        for (int i =0;i< arr.length;i++){
            if (arr[i]%5==0){
                count++;
            }
        }
        System.out.println("Multiple of 5 in an array are :"+ count);
    }
}
