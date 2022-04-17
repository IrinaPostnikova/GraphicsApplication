package com.company.homeWork.Cycles;

import java.util.Scanner;

import static com.company.homeWork.Cycles.Task_18.factorial;

//Сумма i=1 до n  (1+i)/i!
public class Task_15_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите n");
        int n = s.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (1 + i) / (double) factorial(i);
        }
        System.out.println("Ответ = " + sum);
    }
}
