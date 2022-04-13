package com.company.homeWork.Arrays;


import static com.company.homeWork.Arrays.Task_1.inputArrayWithRandom;
import static com.company.homeWork.Arrays.Task_1.printArray;

//Задача 9/Отсортировать массив по возрастанию одним из способов:  пузырьком(Bubble), выбором (Select) или вставками (Insert))
public class Task_9 {
    public static void main(String[] args) {
        int n = 20;
        boolean flag = false;
        int a[] = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);
        for (int k = 0; k < n - 1; k++) {
            flag = false;
            for (int i = 1; i < n; i++) {
                if (a[i] < a[i - 1]) {
                    flag = true;
                    int temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                }
            }
        }
        printArray(a, n);
    }
}
