package com.company.homeWork.Variables;

import java.util.Scanner;

//Пользователь вводит 2 числа (A и B). Выведите в консоль решение (5*A+B^2)/(B-A)
public class Task2 {
    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите А и В");
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (b == a) {
            System.out.println("Делить на 0 нельзя");
        } else {
            c = (5 * a + Math.pow(b, 2)) / (b - a);
            System.out.println("C=" + c);
        }
    }
}



