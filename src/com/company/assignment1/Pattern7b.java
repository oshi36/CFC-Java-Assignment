package com.company.assignment1;

public class Pattern7b {
    public static void main(String[] args) {
        int col = 5;
        int i = 0 ;
        while (col>0){
            i++ ;
            int row = 1 ;
            while (row <= i){
                System.out.print(row + " ");
                row++;
            }
            System.out.println("");

            col-- ;
        }

    }
}
