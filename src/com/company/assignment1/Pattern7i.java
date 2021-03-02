package com.company.assignment1;

public class Pattern7i {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        int row = 0;
        int rowMirror = 0;

        while (rowMirror < 2 * n - 1) {
            int col = 0;
            int colMirror = 0;

            while (colMirror < 2 * n - 1) {
                if (col < row) {
                    System.out.print(n - col);
                } else {
                    System.out.print( n - row );
                }
                if (colMirror >= n - 1) {
                    col--;
                } else {
                    col++;
                }
                colMirror++;
            }
            System.out.println();
            if (rowMirror >= n - 1) {
                row--;
            } else {
                row++;
            }
            rowMirror++;
        }
    }
}


