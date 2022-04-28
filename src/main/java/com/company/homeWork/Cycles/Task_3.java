package com.company.homeWork.Cycles;

import java.util.Scanner;

//Задача_3/Пользователь вводит 1 число (A). Найдите количество положительных целых чисел, квадрат которых меньше A.
public class Task_3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите число 'а'");
       int a = s.nextInt();
        while (a <= 0) {
            System.out.println("Введите положительное число 'a' ");
            a = s.nextInt();
        }
        int count = 0;
        for (int i = 1; i < a; i++) {
            if (i * i < a) {
                count++;
                System.out.println("Числа квадрат которых меньше а - " + count);
            }
        }
        System.out.println("Количество положительных целых чисел, квадрат которых меньше а = " + count);
    }
}
