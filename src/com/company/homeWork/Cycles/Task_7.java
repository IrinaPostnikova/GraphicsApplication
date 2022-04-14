package com.company.homeWork.Cycles;

import java.util.Scanner;

//Задача_7/Пользователь вводит 2 числа. Найти их наибольший общий делитель используя алгоритм Евклида.
public class Task_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите A:");
        int a = s.nextInt();
        System.out.println("Введите B:");
        int b = s.nextInt();

        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        int ost;
        while (b != 0) {
            ost = a % b;
            a = b;
            b = ost;
        }
        System.out.println("Наибольший общий делитель равен: " + a);
    }
}

