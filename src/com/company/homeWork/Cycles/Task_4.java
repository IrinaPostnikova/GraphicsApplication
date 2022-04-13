package com.company.homeWork.Cycles;

import java.util.Scanner;

//Задача_4/Пользователь вводит 1 число (A). Вывести наибольший делитель (кроме самого A) числа A.
public class Task_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("Введите число а");
        a = s.nextInt();
        int i=0;
        for ( i = a / 2; i > 0; i--) {
            if (a % i == 0)
                System.out.println(i);
        }
    }
}
