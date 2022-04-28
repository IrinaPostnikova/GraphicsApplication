package com.company.homeWork.Cycles;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

//Задача_4/Пользователь вводит 1 число (A). Вывести наибольший делитель (кроме самого A) числа A.
public class Task_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = s.nextInt();
        while (a==0 || a==1){
            System.out.println("Введите число а");
            a = s.nextInt();
        }
//        if (a==1){
//            System.out.println("Нет делителей кроме себя самого");
//        }
        for (int i = Math.abs(a) / 2; i > 0; i--) {
            if (Math.abs(a) % i == 0) {
                System.out.println("Наибольший делитель a (кроме а) = " + i);
                break;
            }
        }
    }
}

