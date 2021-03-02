package com.company.assignment1;
import java.util.Arrays;

public class EvenOddJump {
    public static void main(String[] args) {
        int num = 10;
        int even = 0;
        int jump = 1;
        while (num > 0) {
            even += 2;
            System.out.print(even + " ");
            even += jump * 2;
            jump += 2;
            num--;
        }
    }
}
