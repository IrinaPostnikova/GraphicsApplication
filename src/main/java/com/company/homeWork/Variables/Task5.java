package com.company.homeWork.Variables;

// Пользователь вводит 4 числа (X1, Y1, X2, Y2), описывающие координаты 2-х точек на координатной плоскости.
// Выведите уравнение прямой в формате Y=AX+B, проходящей через эти точки.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int x1, x2, y1, y2, A, B;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты первой точки");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();

        System.out.println("Введите координаты второй точки");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        A = (y2 - y1) / (x2 - x1);
        B = y1 - (A * x1);
        System.out.println("Уравнение прямой    " + "Y= " + A + "x +" + B);
    }
}
