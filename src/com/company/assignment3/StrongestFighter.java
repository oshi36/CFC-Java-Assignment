package com.company.assignment3;
import java.util.Scanner;
import java.util.Arrays;

public class StrongestFighter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements");
        int n = sc.nextInt();
        System.out.println("Enter sub-group size");
        int k = sc.nextInt();
        int [] ar = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        int t = n-k;
        for (int i = t; i < ar.length ; i++) {
            System.out.print(ar[i] + " ");
        }
    }

}
