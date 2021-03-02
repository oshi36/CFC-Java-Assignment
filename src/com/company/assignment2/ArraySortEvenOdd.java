package com.company.assignment2;
import java.util.Arrays;

public class ArraySortEvenOdd {
    public static void main(String[] args) {
        int [] arr = { 3,8,5,13,6,12,18,5};
        evenOddSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void evenOddSort (int[] arr){
        int i = 0 ;
        int j = 1;
        while(i < arr.length){
            if(arr[i]%2==0){
                i++;
            }
            if(arr[j]%2==0) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
            if(j== arr.length-1){
                i = arr.length;
                break;
            }
            j++;
        }
    }

}
