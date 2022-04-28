package com.company.homeWork.Cycles;

import java.util.Scanner;

//Задача_11/Пользователь вводит целое положительное  число (N). Выведите числа в диапазоне от 1 до N, сумма четных цифр которых больше суммы нечетных.
public class Task_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите положительное число N");
        int N = s.nextInt();

        while (N <= 0) {
            System.out.println("Введите положительное число N");
            N = s.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            int a = i;
            int evenNumb = 0;
            int oddNumb = 0;
            int b = 0;
            while (a != 0) {
                b = a % 10;

                if (b % 2 == 0) {
                    evenNumb = evenNumb + b;
                } else {
                    oddNumb = oddNumb + b;
                }
                a /= 10;
            }
            if (oddNumb > evenNumb) {
                System.out.println("В числе  " + i + "  сумма нечетных чифр больше суммы четных");
            }
        }


    }
}
