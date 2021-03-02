package com.company.assignment3;

public class SpiralAnticlockwise {
    public static void main(String[] args) {

        int[][] arr ={
                {11 , 12 , 13 , 14} ,
                {21 , 22 , 23 , 24} ,
                {31 , 32 , 33, 34} ,
                {41 , 42 , 43 , 44}};

        spiralAnti(arr , 0);

    }

    public static void spiralAnti(int [][] arr ,int count ){

        while(count < 3) {
            int n = 4;
            int m = 4;
            int j = count;
            for (int i = count; i < n - count; i++) {
                System.out.print(arr[i][j] + " ");

            }
            j = n - 1 - count;
            for (int i = count + 1; i < m - count; i++) {
                System.out.print(arr[j][i] + " ");
            }
            j= m-1 - count;
            for (int i = n - 2 - count; i >= count; i--) {
                System.out.print(arr[i][j] + " ");

            }
            j = count;
            for (int i = m - 2 - count; i > count; i--) {

                System.out.print(arr[j][i] + " ");

            }
            count++;

        }

    }

}
