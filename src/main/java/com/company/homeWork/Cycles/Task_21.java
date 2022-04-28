package com.company.homeWork.Cycles;

import java.util.Scanner;

public class Task_21 {

    public static int countNumbers(int a) {
        int count = 0;
        while (a != 0) {
            a /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите а = ");
        int a = s.nextInt();
        int length = 0;
        int i = 1;
        while (length < a) {
            System.out.print(i);
            length += countNumbers(i);
            i++;
        }
        System.out.println("\n" + a + "-я цифра последовательности - " + (int) ((i - 1) / Math.pow(10, length - a)) % 10);
    }
}
