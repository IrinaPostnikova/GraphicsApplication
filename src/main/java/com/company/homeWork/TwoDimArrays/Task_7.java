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
        int n = 5;
        int m = 6;
        int a[][] = inputArray(n, m, 0, 20);

        printArray(a, n, m);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите k ");
        int k = scanner.nextInt();
        System.out.println("Условие 1: Все элементы k-го столбца нулевые");
        int count = 0;
        boolean[] b = new boolean[n];
        //1)
        for (int i = 0; i < n; i++) {
            if (a[i][k] == 0) {
                count++;
            }
            if (count != 0) {
                b[k] = true;
                count = 0;
            } else {
                b[k] = false;
            }
        }
        System.out.println("Логический вектор: " + b[k]);

        System.out.println("Условие 2: Элементы k-ой строки матрицы упорядочены по убыванию");
        int count1 = 0;
        boolean[] c = new boolean[m];
        for (int j = 0; j < n - 1; j++) {
            if (a[k][j] >= a[k][j + 1]) {
                count1++;
            }
            if (count1 != 0) {
                c[k] = true;
                count1 = 0;
            } else {
                c[k] = false;
                break;
            }
        }
        System.out.println("Логический вектор: " + c[k]);

        //3)

        System.out.println("Условие 3: k-я строка массива симметрична");
        int count2 = 0;
        boolean[] d = new boolean[m];
        for (int j = 0; j<=n/2; j++) {
            if (a[k][j] == a[k][(n - 1) - j]) {
                count2++;
            }
            if (count2 != 0) {
                d[k] = true;
                count2 = 0;
            } else {
                d[k] = false;
                break;
            }
        }
        System.out.println("Логический вектор: " + d[k]);
    }

}

