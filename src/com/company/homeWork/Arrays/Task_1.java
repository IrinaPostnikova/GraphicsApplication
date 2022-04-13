package com.company.homeWork.Arrays;


import java.util.Random;
import java.util.Scanner;

//Задача 1/Найти минимальный элемент массива
public class Task_1 {
    public static void main(String[] args) {


            int n = 20;
            int a[] = inputArrayWithRandom(n, 0, 50);
            printArray(a, n);
            int min = a[0];
            for (int i = 1; i < n; i++) {
                if (a[i] < min) {
                    min = a[i];
                }
            }
            System.out.println("Минимальный элемент  " + min);
            }
    public static int[] inputArrayWithRandom(int n, int a, int b) {
        Random random = new Random();
        int arr[] = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(a, b); //в скобках мы задали диапазон значений от 0 до 99
            // arr[i]=random.nextInt(100)-50; //в скобках мы задали диапазон значений от -50до50
            // arr[i]=random.nextInt(0,100); оригин включительно баунд не включительно
        }
        return arr;
    }

    public static void printArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }
}
