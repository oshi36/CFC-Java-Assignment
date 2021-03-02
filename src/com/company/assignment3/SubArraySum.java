package com.company.assignment3;
import java.util.Scanner;

public class SubArraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total array elements");
        int n = sc.nextInt();
        System.out.println("Enter sub-array size");
        int k = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println(sum(arr , k));

    }

    public static int sum (int[] arr , int k ){
        int sum = 0 ;
        for (int i = 0; i <= arr.length-k; i++) {
            int max = arr[i];
            int min = arr[i];
            for (int j = i+1 ; j < k +i; j++) {
                if(arr[j]>max){
                    max = arr[j];
                }
                if (arr[j] < min){
                    min = arr[j];
                }

            }
            sum = sum + max + min;

        }

        return sum;

    }
}
