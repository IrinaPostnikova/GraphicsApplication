package com.company.homeWork.Cycles;

import java.util.Scanner;

//Задача_14/x/1!+x^2/2!+x^3/3!+...+x^n/n!
public class Task_14_2 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите х");
        int x = s.nextInt();
        System.out.println("Введите n");
        int n = s.nextInt();
        double a = 1;
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            a = a * x / i;
            sum = sum + a;
        }
        System.out.println("Ответ = " + sum);
    }
}
