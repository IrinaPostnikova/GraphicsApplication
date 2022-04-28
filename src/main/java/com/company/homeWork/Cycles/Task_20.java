package com.company.homeWork.Cycles;

import java.util.Scanner;

/*Определить, является ли заданное число совершенным , т.е. равным сумме всех своих (положительных) делителей,
кроме самого этого числа (например, число 6 совершенно: 6=1+2+3).
 */

public class Task_20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = s.nextInt();
        while (a == 0 || a == 1) {
            System.out.println("Введите число а");
            a = s.nextInt();
        }
        int del = 0;
        for (int i = Math.abs(a) / 2; i > 0; i--) {

            if (Math.abs(a) % i == 0) {
                System.out.println("делители a (кроме а) = " + i);
                del += i;
            }
        }
        System.out.println("Cумма всех делителей" + del);
        if (del == a) {
            System.out.println("число является совершенным");
        } else {
            System.out.println("число не является совершенным");
        }
    }
}


