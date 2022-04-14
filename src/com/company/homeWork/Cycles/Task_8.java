package com.company.homeWork.Cycles;

import java.sql.SQLOutput;
import java.util.Scanner;

//Задача_8/Пользователь вводит целое положительное число, которое является кубом целого числа N.
// Найдите число N методом половинного деления.
public class Task_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = 0;
        //int N;

        while (Math.abs(a - b) > 0) {
            int N = (a + b) / 2;
            if (N * N * N == a) {
                System.out.println(N);
            }
            else if (N * N * N > a) {
                a = N;
            } else if (N * N * N < a) {
                b = N;
            }
            System.out.println(N);
            }
        }
        //
    }

