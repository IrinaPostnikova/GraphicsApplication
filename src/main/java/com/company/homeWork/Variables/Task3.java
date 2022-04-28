package com.company.homeWork.Variables;

import java.util.Scanner;

//Пользователь вводит 2 строковых(string) значения(A и B). Поменяйте содержимое переменных A и B местами.
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c;
        c = b;
        b = a;
        a = c;
        System.out.println(a + " " + b);
    }
}
