package com.company.homeWork.Arrays;

import static com.company.homeWork.Arrays.Task_1.inputArrayWithRandom;
import static com.company.homeWork.Arrays.Task_1.printArray;

//Задача 8/Поменять местами первую и вторую половину массива, например, для массива 1 2 3 4, результат 3 4 1 2,  или для 12345 - 45312.
public class Task_8 {
    public static void main(String[] args) {
        int n = 9;
        int arrayMiddle=n%2;
        int a[] = inputArrayWithRandom(n, 0, 10);
        printArray(a, n);
        for (int i = 0; i < n/2; i++) {
            // System.out.print(b);
            int tmp = a[i];
            a[i]=a[n/2+i+arrayMiddle];
            a[n/2+i+arrayMiddle]=tmp;
        }
        printArray(a, n);
    }
}
