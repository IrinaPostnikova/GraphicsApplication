package com.company.homeWork.Cycles;


import java.util.Scanner;

//Задача_14/Дано действительное число х, натуральное число n. Вычислить:
//1/x+1/x(x+1)+ 1/x(x+1)(x+2)+...+1/x(x+1)...(x+n)
public class Task_14_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите х");
        int x = s.nextInt();
        System.out.println("Введите n");
        int n = s.nextInt();
        double a = 1 ;
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            a = a / (x + i);
            sum = sum + a;
        }
        System.out.println("Ответ = "+sum);
    }
}
