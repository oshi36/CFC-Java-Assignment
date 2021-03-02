package com.company.assignment2;
import java.util.Scanner;

public class PairEqualSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        System.out.println("Enter array elements");
        for (int i = 0; i < 11; i++) {
            arr[i]= sc.nextInt();
        }
        pairs(arr);
    }

    public static void pairs(int[] arr){
        int a , b ;
        int i = 0 ;
        int j = 1 ;
        int n = 0 ;
        int t = 8;
        int[][] result = new int[arr.length/2][2];
        while (i < arr.length-1){
            a = t - arr[i];
            if(arr[j]==a){
                result[n][0] = arr[i] ;
                result[n][1] = a ;
                n++ ;
                j= i + 1;
                i++;
            }else if(arr[j] != a) {
                j++;

            }
            if(j >arr.length - 1){
                i++;
                j = i + 1;
            }

        }
        for (int k = 0; k < n; k++) {
            System.out.print("(" + result[k][0] + ","+ result[k][1] + ")" +",");

        }
    }
}
