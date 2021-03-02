package com.company.assignment2;

public class ArraySubset {
    public static void main(String[] args) {
        int arr[] = {7,2,6};
        printSubsets(arr);
    }
    public static void printSubsets(int arr[]) {
            int n = arr.length;

            for (int i = 0; i < (1 << n); i++) {
                System.out.print("{ ");

                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) > 0)
                        System.out.print(arr[j] + " ");
                }
                    System.out.println("}");
            }
        }


    }

