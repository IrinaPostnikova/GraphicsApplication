package com.company.homeWork.Arrays;

import static com.company.homeWork.Arrays.Task_1.inputArrayWithRandom;
import static com.company.homeWork.Arrays.Task_1.printArray;

//Задача 5/Посчитать сумму элементов массива с нечетными индексами
public class Task_5 {
    public static void main(String[] args) {
        int n = 10;
        int a[] = inputArrayWithRandom(n, 0, 10);
        printArray(a, n);
        int chet = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                sum += a[i];
            }
        }
        System.out.println("Сумма элементов массива с нечетными индексами  " + sum);
    }
}
