package com.company.homeWork.TwoDimArrays;

import static com.company.homeWork.TwoDimArrays.Task_1.inputArray;
import static com.company.homeWork.TwoDimArrays.Task_1.printArray;

public class Task_8a {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int a[][] = inputArray(n, m, 0, 9);
        printArray(a, n, m);
        double b[] = new double[m];
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < m; j++) {
                sum =(sum + (1.0*a[i][j])/n);
                b[i] = sum;
            }
            System.out.println(" " + b[i]);
        }
    }
}
