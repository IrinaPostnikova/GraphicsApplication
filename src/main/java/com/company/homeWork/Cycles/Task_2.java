package com.company.homeWork.Cycles;

import java.util.Scanner;

//Задача_2/Пользователь вводит 1 число (A). Вывести все числа от 1 до 1000, которые делятся на A.
public class Task_2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите число а");
       int a = s.nextInt();
        for (int i = a; i <= 1000; i += a) {
            System.out.println("числа от 1 до 1000, которые делятся на a - " + i);
        }
    }
}
