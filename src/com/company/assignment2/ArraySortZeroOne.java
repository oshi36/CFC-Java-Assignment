package com.company.assignment2;
import java.util.Scanner;
import java.util.Arrays;

public class ArraySortZeroOne {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[13];
        System.out.println("Enter binary array");
        for (int i =0 ;i< ar.length;i++){
            ar[i] = sc.nextInt();
        }
        toSortArray(ar);
    }
    
    public static void toSortArray(int ar[]){
        int zeroCount =0;
        for (int i =0;i< ar.length;i++){
            if (ar[i]==0){
                ar[zeroCount++]=0;
            }
        }

        for (int i =zeroCount ;i< ar.length;i++){
            ar[zeroCount++]=1;
        }
        System.out.println("After sorting array is :"+Arrays.toString(ar));

    }
}
