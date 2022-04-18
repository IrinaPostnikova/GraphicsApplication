package com.company.homeWork.Arrays;

import static com.company.homeWork.Arrays.Task_1.inputArrayWithRandom;
import static com.company.homeWork.Arrays.Task_1.printArray;

//Задача 3/Найти индекс минимального элемента массива
public class Task_3 {
    public static void main(String[] args) {
        int n = 20;
        int a[] = inputArrayWithRandom(n, 0, 50);
        printArray(a, n);
        int min = a[0];
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            }
        }
        System.out.println("Индекс минимального элемента массива " + minIndex);
    }
}
