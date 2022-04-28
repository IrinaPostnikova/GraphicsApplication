package com.company.homeWork.TwoDimArrays;

import static com.company.homeWork.TwoDimArrays.Task_1.inputArray;
import static com.company.homeWork.TwoDimArrays.Task_1.printArray;

public class Task_2 {
    public static void main(String[] args) {
        int n = 5;
        int m = 6;
        int a[][] = inputArray(n, m, 0, 100);
        printArray(a, n, m);
        int max = a[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент массива");
        System.out.println(max);
    }
}
