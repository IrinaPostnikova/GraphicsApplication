package com.company.homeWork.TwoDimArrays;

import static com.company.homeWork.TwoDimArrays.Task_1.inputArray;
import static com.company.homeWork.TwoDimArrays.Task_1.printArray;

public class Task_8b {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int a[][] = inputArray(n, m, 0, 9);
        printArray(a, n, m);
        int c[] = new int[m];
        for (int i = 0; i < n; i++) {
            int mul = 1;
            for (int j = 0; j < m; j++) {
                mul = mul * a[i][j];
                c[i] = mul;
            }
            System.out.println(" " + c[i]);
        }
    }
}
