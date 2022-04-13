package com.company.homeWork.Cycles;

import java.util.Scanner;

//Задача_5/Пользователь вводит 2 числа (A и B). Вывести сумму всех чисел из диапазона от A до B, которые делятся без остатка на 7.
// (Учтите, что при вводе B может оказаться меньше A).
public class Task_5 {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        if (b < a) {
            int c = a;
            a = b;
            b = c;
        }
        int sum = 0;
        for (int i = a; i < b; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println("сумма=  " + sum);
    }
}
