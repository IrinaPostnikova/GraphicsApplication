package com.company.homeWork.Arrays;

import static com.company.homeWork.Arrays.Task_1.inputArrayWithRandom;
import static com.company.homeWork.Arrays.Task_1.printArray;

//Задача 2/Найти максимальный элемент массива
public class Task_2 {
    public static void main(String[] args) {
        int n = 10;
        int a[] = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Максимальный элемент массива " + max);
    }
}
