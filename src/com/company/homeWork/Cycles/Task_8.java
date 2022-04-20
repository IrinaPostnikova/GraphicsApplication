package com.company.homeWork.Cycles;

import java.sql.SQLOutput;
import java.util.Scanner;

//Задача_8/Пользователь вводит целое положительное число, которое является кубом целого числа N.
// Найдите число N методом половинного деления.
public class Task_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int div = a;

        while (a < div * div * div) {
            if (a == div * div * div) {
                System.out.println(div);
            } else
                div=div/2;
        }
        for (int i = div; i <div*2 ; i++) {
            if  (a == i * i * i) {
                System.out.println(i);
            }
        }
    }
}






