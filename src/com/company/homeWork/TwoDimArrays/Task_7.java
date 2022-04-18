package com.company.homeWork.TwoDimArrays;

import java.util.Random;
import java.util.Scanner;

import static com.company.homeWork.TwoDimArrays.Task_1.inputArray;
import static com.company.homeWork.TwoDimArrays.Task_1.printArray;

public class Task_7 {

        public static void printArrayOne(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int a[][] = inputArray(n, m, 0, 15);
        int b[]=new int[n];
        printArray(a, n, m);


    }
}
