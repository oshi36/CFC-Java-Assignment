package com.company.assignment3;
import java.util.Scanner;
import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of array elements");
        int n1 = sc.nextInt();
        int ar1[] = new int[n1];
        System.out.println("Enter array elements");
        for (int i = 0; i < n1; i++) {
            ar1[i] = sc.nextInt();
        }

        System.out.println("Enter total number of array elements");
        int n2 = sc.nextInt();
        int ar2[] = new int[n2];
        System.out.println("Enter array elements");
        for (int i = 0; i < n2; i++) {
            ar2[i] = sc.nextInt();
        }

        int[] arr = sum(ar1 , ar2);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sum( int[] ar1 , int[] ar2  ){
        int l = ar1.length > ar2.length ? ar2.length : ar1.length;
        int[] arr = new int[ l +1];
        int sum = 0;
        for (int i = l-1; i >= 0 ; i--) {
            sum = ar1[i] + ar2[i] + sum;
            if(sum > 9){
                sum= sum%10;
                arr[i+1] = sum ;
                sum = 1;
            }else {
                arr[i +1] = sum ;
                sum = 0;

            }
        }
        arr[0] = sum ;
        return arr ;
    }

}
