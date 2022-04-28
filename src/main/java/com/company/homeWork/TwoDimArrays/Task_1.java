package com.company.homeWork.TwoDimArrays;


import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    //создаем Функцию по созданию массива случайными числами
    public static int[][] inputArray(int n, int m, int a, int b) {
        Random random = new Random();
        int arr[][] = new int[n][m];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = random.nextInt(a, b);
            }
        }
        return arr;
    }

    //создаем Функцию по выводу массива на экран
    public static void printArray(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }


//Найти минимальный элемент массива
    public static void main(String[] args) {
        int n = 5;
        int m = 6;
        int a[][] = inputArray(n, m, 0, 50);
        printArray(a, n, m);
        int min = a[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }
        System.out.println("Минимальный элемент массива");
        System.out.println(min);
    }
}
