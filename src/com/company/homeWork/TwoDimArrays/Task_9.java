package com.company.homeWork.TwoDimArrays;

import static com.company.homeWork.TwoDimArrays.Task_1.inputArray;
import static com.company.homeWork.TwoDimArrays.Task_1.printArray;

public class Task_9 {
    public static void main(String[] args) {

        int n = 2;
        int m = 3;
        int temp;
        int[] min = new int[n];
        int[] max = new int[m];
        boolean check = true;
        int a[][] = inputArray(n, m, 0, 5);
        printArray(a, n, m);
        for (int i = 0; i < n; i++) {
            temp = a[i][0];
            for (int j = 1; j < m; j++) {
                if (a[i][j] < temp) {
                    temp = a[i][j];
                }
                min[i] = temp;
            }
        }
        for (int j = 0; j < m; j++) {
            temp = a[0][j];
            for (int i = 1; i < n; i++) {
                if (a[i][j] > temp) {
                    temp = a[i][j];
                }
                max[j] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == max[j] && a[i][j] == min[i]) {
                    System.out.print("\nСедловая точка - " + a[i][j] + "; Индекс седловой точки = " + i + ", " + j);
                    check = false;
                }
            }
        }

        if (check) {
            System.out.print("\nСедловой точки нет");
        }
    }
}


