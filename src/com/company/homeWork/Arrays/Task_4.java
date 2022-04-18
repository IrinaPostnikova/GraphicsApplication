package com.company.homeWork.Arrays;


import static com.company.homeWork.Arrays.Task_1.inputArrayWithRandom;
import static com.company.homeWork.Arrays.Task_1.printArray;

//Задача 4/Найти индекс максимального элемента массива
public class Task_4 {
    public static void main(String[] args) {
        int n = 20;
        int a[] = inputArrayWithRandom(n, 0, 50);
        printArray(a, n);
        int max = a[0];
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
        }
        System.out.println("Индекс максимального элемента массива " + maxIndex);
    }
}
