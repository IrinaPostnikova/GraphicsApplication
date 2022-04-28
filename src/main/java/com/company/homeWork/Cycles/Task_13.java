package com.company.homeWork.Cycles;


import java.util.Scanner;

//Задача_13/Дано натуральное n. Вычислить: (1+1/1^2)+(1+1/2^2)+…+(1+1/n^2)
public class Task_13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите n");
        int n = s.nextInt();

        double sum = 0;
        int i;
        for (i = 1; i <= n; i++) {
            sum += 1.0 * (1 + (1 / Math.pow(i, 2)));
        }

        System.out.println(sum);
    }

}
