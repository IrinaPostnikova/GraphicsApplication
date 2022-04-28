package com.company.homeWork.Cycles;


import java.util.Scanner;

//Задача_1/Пользователь вводит 2 числа (A и B). Возвести число A в степень B.
public class Task_1 {
    public static void main(String[] args) {
              Scanner s = new Scanner(System.in);
        System.out.println("Введите а");
       int a = s.nextInt();
        System.out.println("Введите в");
       int b = s.nextInt();
        // while (a != 0) {
        int tmp = a;
        for (int i = 1; i < b; i++) {
            a = tmp * a;
        }
        System.out.println("a^b = " + a);
    }
}
