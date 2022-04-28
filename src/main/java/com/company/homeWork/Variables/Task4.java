package com.company.homeWork.Variables;

import java.util.Scanner;

// Пользователь вводит 3 не равных 0 числа (A, B и С). Выведите в консоль решение(значение X) линейного уравнения стандартного вида, где A*X+B=C
public class Task4 {
    public static void main(String[] args) {
        double x, A, B, C;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите A, B, C ");
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();
        if (A != 0 && B != 0 && C != 0) {
            x = (C - B) / A;
            System.out.println("x=" + x);
        } else {
            System.out.println(" Вводить 0 нельзя");
        }
    }
}
