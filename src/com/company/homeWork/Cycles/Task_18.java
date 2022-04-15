package com.company.homeWork.Cycles;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

/*Найти все трехзначные числа, представимые в виде сумм
факториалов  своих цифр*/
public class Task_18 {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int result = 0;
        for (int i = 100; i < 700; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            result = factorial(a) + factorial(b) + factorial(c);
            if (result == i) {
                System.out.println(result);
            }
        }
    }

    //расчет факториала
//        Scanner s=new Scanner(System.in);
//        System.out.println("Введите число n");
//        int n=s.nextInt();
//        int fact=1;
//        for (int i = 1; i <=n; i++) {
//            fact*=i;
//        }
//        System.out.println(fact);
//    }


}

