package com.company.homeWork.TwoDimArrays;

import static com.company.homeWork.TwoDimArrays.Task_1.inputArray;
import static com.company.homeWork.TwoDimArrays.Task_1.printArray;

public class Task_8c {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int a[][] = inputArray(n, m, 0, 9);
        printArray(a, n, m);
        int d[] = new int[m];
        for (int i = 0; i < n; i++) {
            int aMean = 1;
            int sum=0;
            for (int j = 0; j < m; j++) {
                sum=sum + a[i][j];


                aMean = aMean * a[i][j];
                d[i] = aMean;
            }
            System.out.println(" " + d[i]);
        }
    }
}
