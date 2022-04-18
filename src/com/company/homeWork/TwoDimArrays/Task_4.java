package com.company.homeWork.TwoDimArrays;

import static com.company.homeWork.TwoDimArrays.Task_1.inputArray;
import static com.company.homeWork.TwoDimArrays.Task_1.printArray;

//Найти индекс максимального элемента массива
public class Task_4 {
    public static void main(String[] args) {
        int n = 5;
        int m = 6;
        int a[][] = inputArray(n, m, 0, 100);
        printArray(a, n, m);
        int max = a[0][0];
        int maxIndexi = 0;
        int maxIndexj = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    maxIndexi = i;
                    maxIndexj = j;
                }
            }
        }
        System.out.println("Индекс максимального элемента массива");
        System.out.println("Строка  " + maxIndexi + "  Столбец " + maxIndexj);
    }
}
