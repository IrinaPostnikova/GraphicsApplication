package com.company.homeWork.Variables;

import java.util.Scanner;

//Пользователь вводит 2 числа (A и B). Выведите в консоль результат деления A на B и остаток от деления.
public class Task1 {
    public static void main(String[] args) {
        int a, b, d;
        double s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а");
        a = scanner.nextInt();
        System.out.println("Введите b не равное 0 ");
        b = scanner.nextInt();
        if (b == 0) {
            System.out.println("делить на 0 нельзя");
        } else {
            s = a / b;
            d = a % b;
            System.out.println("a/b=" + s);
            System.out.println("остаток" + d);
        }

    }

}