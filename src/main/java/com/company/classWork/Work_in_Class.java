package com.company.classWork;

import java.util.Random;
import java.util.Scanner;

public class Work_in_Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  int a = scanner.nextInt();
        int n = 20;
        boolean flag = false;
        int a[] = inputArrayWithRandom(n, 0, 20);

        printArray(a, n);
        for (int k = 0; k < n - 1; k++) {
            flag = false;
            for (int i = 1; i < n; i++) {
                if (a[i] > a[i - 1]) {
                    flag = true;
                    int temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                }
            }
        }
        printArray(a, n);

      /*  for (int i=0; i<20; i++){
            System.out.println(arr[i]+ " ");

            //то же через 2
            // for (int i=0; i<20; i+2){
            //            System.out.println(arr[i]+ " ");

            //
            int arb[]= new int[m];
            int arc []=new int[k];
            printArray(arr,n);
            printArray(arb,m);
            printArray(arc,k);
        }*/
    }

    //функция для вывода (массива мы создали), после чего просто вызываем этот метод, чтобы сократить код
    public static void printArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }

  /*  //заполняем массив (так работает если хотим вводить сами)
    public static int[] inputArray(int n){
        int a[] =new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<n;i++)
            a[i]=scanner.nextInt();
        return a;
    }*/

    //если не ручками то каким образом мы будем заполнять массив
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


    ///задача 7/Посчитать количество нечетных элементов массива задача 7.
    public static void task7() {
        int n = 20;

        int a[] = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                sum += a[i];
                count++;
            } //количество нечетных

        }
        System.out.println(sum);
        System.out.println(count);
    }
    }

