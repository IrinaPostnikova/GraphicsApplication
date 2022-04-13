package com.company.homeWork.Arrays;


import static com.company.homeWork.Arrays.Task_1.inputArrayWithRandom;
import static com.company.homeWork.Arrays.Task_1.printArray;

//Задача 7/Посчитать количество нечетных элементов массива
public class Task_7 {
    public static void main(String[] args) {
        int n = 20;
        int a[] = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);
        //int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                //   sum += a[i];
                count++;
            } //количество нечетных
        }
        //System.out.println(sum);
        System.out.println("Количество нечетных элементов массива= " + count);
    }
}
