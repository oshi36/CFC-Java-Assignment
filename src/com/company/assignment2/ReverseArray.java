package com.company.assignment2;
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int [] arr = { 2,4,6,8,10};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr) {
        for (int i = 0; i <= (int) arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = t;

        }
    }
}