package com.company.homeWork.Cycles;


import java.util.Scanner;

//Можно ли заданное натуральное число М представить в виде суммы квадратов двух натуральных чисел?
// Написать программу решения этой задачи.
public class Task_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
       // boolean flag = false;
        for (int i = 1; i <= Math.sqrt(a); i++) {
            for (int j = i; j <= Math.sqrt(a); j++) {
                if (i * i + j * j == a) {
                    System.out.println("Можно");
                  //  flag = true;
                  //  break;
                    return;
                }
            }
           // if (flag) break;
        }
       // if (!flag)
            System.out.println("нельзя");




 /*   //public static void task19_2way()
    public static void task19() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean flag = false;
        for (int i = 1; i <= Math.sqrt(a); i++) {
            for (int j = i; j <= Math.sqrt(a); j++) {
                if (i * i + j * j == a) {
                    System.out.println("Можно");

                    return;
                }

            }
            if (flag) break;
        }
        System.out.println("нет");
    }*/




    }
}
