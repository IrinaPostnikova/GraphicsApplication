package com.company.homeWork.TwoDimArrays;

import static com.company.homeWork.TwoDimArrays.Task_1.inputArray;
import static com.company.homeWork.TwoDimArrays.Task_1.printArray;

//Найти количество элементов массива, которые больше всех своих соседей одновременно
public class Task_5 {
    public static void main(String[] args) {
        int n = 5;
        int m = 6;
        int a[][] = inputArray(n, m, 0, 100);
        printArray(a, n, m);
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isLocalMax(a, n, m, i, j)) {
                    count++;
                    System.out.println(count + "число= " + a[i][j]);
                    System.out.println("строка " + i + "столбец  " + j);
                }
            }
        }
        if (count == 0) {
            System.out.println("чисел нет");
        }
    }


    public static boolean isLocalMax(int arr[][], int n, int m, int i, int j) {
        int startI = i > 0 ? i - 1 : 0;
        int endI = i < n - 1 ? i + 1 : n - 1;
        int startJ = j > 0 ? j - 1 : 0;
        int endJ = j < m - 1 ? j + 1 : m - 1;
        for (int f = startI; f <= endI; f++) {
            for (int k = startJ; k <= endJ; k++) {
                if (!(f == i && k == j)) {
                    if (arr[f][k] >= arr[i][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

