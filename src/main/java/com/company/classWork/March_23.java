package com.company.classWork;

import java.util.Scanner;

public class March_23 {
    public static void main(String[] args) {
        // write your code here
        task1();
    }
       /* Scanner s= new Scanner(System.in);
        for (int i=0; i<=100; i+=5){
            System.out.println(i);
        }*/
    public static void task1 ()    {
        int z;
        do {
            Scanner s= new Scanner(System.in);
            z=s.nextInt();
            System.out.println("ищи еще");//todo выполняет еще 1 разпосле первого ввода больше 50тыс
        }

        while (z<50000);
        System.out.println("нашел");
    }
    }

//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int n = 0;
//        if (a > (int) a) {
//
//            do {
//                a *= 10;
//                n = (int) a % 10;
//
//            } while (n == 0);
//            System.out.println(n);
//        } else System.out.println("false");
//
//
////создали функцию кот возвращает кол-во цивр в данном числе (считает длин поей последовательности)
//        public static int countNumbers(int a) {
//            int count=0;
//            while (a!=0);{
//                a/=10;
//                count++;
//            }
//            return count;
//        }
//    }
