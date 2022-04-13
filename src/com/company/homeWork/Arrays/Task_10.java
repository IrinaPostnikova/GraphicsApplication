package com.company.homeWork.Arrays;

import static com.company.homeWork.Arrays.Task_1.inputArrayWithRandom;
import static com.company.homeWork.Arrays.Task_1.printArray;

//Задача 10/Отсортировать массив по убыванию одним из способов, (отличным от способа в 9-м задании) :  пузырьком(Bubble), выбором (Select) или вставками (Insert))
public class Task_10 {
    public static void main(String[] args) {
        int n = 20;
        int a[] = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);
        for (int i = 1; i < n; i++) {
            int tmp = a[i];
            int j = i;
            while (j > 0 && a[j - 1] < tmp) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = tmp;
        }
        printArray(a, n);
    }
}
