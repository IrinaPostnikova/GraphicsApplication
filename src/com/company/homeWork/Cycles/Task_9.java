package com.company.homeWork.Cycles;

import java.util.Scanner;

//Задача_9/Пользователь вводит 1 число. Найти количество нечетных цифр этого числа.
public class Task_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = 0;
        int count = 0;
        while (a!=0) {
            b = a % 10;
            a/=10;
        if (b % 2 != 0) {
            count++;
        }
        }
        System.out.println("количество нечетных цифр этого числа= "+count);
        }
    }


