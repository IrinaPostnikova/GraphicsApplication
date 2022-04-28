package com.company.homeWork.TwoDimArrays;

import static com.company.homeWork.TwoDimArrays.Task_1.inputArray;
import static com.company.homeWork.TwoDimArrays.Task_1.printArray;
//Найти индекс минимального элемента массива
public class Task_3 {
    public static void main(String[] args) {
        int n = 5;
        int m = 6;
        int a[][] = inputArray(n, m, 0, 100);
        printArray(a, n, m);
        int min = a[0][0];
        int minIndexi = 0;
        int minIndexj = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    minIndexi = i;
                    minIndexj = j;
                }
            }
        }
        System.out.println("Индекс минимального элемента массива");
        System.out.println("Строка  " + minIndexi + "  Столбец " + minIndexj);
    }
}
