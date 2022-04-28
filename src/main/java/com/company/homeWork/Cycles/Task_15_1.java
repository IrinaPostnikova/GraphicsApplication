package com.company.homeWork.Cycles;

import java.util.Scanner;

import static com.company.homeWork.Cycles.Task_18.factorial;

//произведение i=1 до n (2+1/i!)
public class Task_15_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите n");
        int n = s.nextInt();
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * (2 + (1 / (double) factorial(i)));
        }
        System.out.println("Ответ = " + result);
    }
}
