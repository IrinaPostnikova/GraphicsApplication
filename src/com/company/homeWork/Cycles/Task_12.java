package com.company.homeWork.Cycles;

import java.util.Scanner;

//Задача_12/Пользователь вводит 2 числа.
// Сообщите, есть ли в написании двух чисел одинаковые цифры.
// Например, для пары 123 и 3456789, ответом будет являться “ДА”, а, для пары 500 и 99 - “НЕТ”.
public class Task_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите а");
        int a = s.nextInt();
        System.out.println("Введите b");
        int b = s.nextInt();
        int c = 0;
        int d = 0;
        while (a != 0) {
            c = a % 10;
            a /= 10;
            while (b != 0) {
                d = b % 10;
                b /= 10;
                if (c == d) {
                    System.out.println("ya");
                    break;
                }
                else {
                    System.out.println("no");
                }
            }

        }


//        for (int i = 1; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                a %= 10;
//                a /= 10;
//                b %= 10;
//                b /= 10;
//                            }
//
//
//        }
//        if (a % 10 == b % 10) {
//            System.out.println("yes");
//        }
//        else {
//            System.out.println("no");
//        }
    }
}
