package com.company.homeWork.Cycles;

import java.sql.SQLOutput;
import java.util.Scanner;

//Задача_10/Пользователь вводит 1 число. Найти число, которое является зеркальным отображением последовательности
// цифр заданного числа, например, задано число 123, вывести 321.
public class Task_10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Введите число");
        int a = s.nextInt();
        int b= 0;
        while (a!=0) {
           b+=a%10;
           b*=10;
           a/=10;
        }
        System.out.println("Зеркальное отображение ");
        System.out.println(b/10);
    }
}
