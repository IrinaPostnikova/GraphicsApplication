package com.company.homeWork.Cycles;

import java.util.Scanner;

//Задача_6/Пользователь вводит 1 положительное число (N).
// Выведите N-ое число ряда фибоначчи. В ряду фибоначчи каждое следующее число является суммой двух предыдущих.
// Первое и второе считаются равными 1.
public class Task_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число N ");
        int N = s.nextInt();

        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        for (int i = 2; i < N; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        System.out.println("");
        System.out.println("N-ное число Фибоначчи " + f3);
    }
}
