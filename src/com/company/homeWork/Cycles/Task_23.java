package com.company.homeWork.Cycles;

import java.util.Scanner;

import static com.company.homeWork.Cycles.Task_21.countNumbers;

public class Task_23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите а = ");
        int a = s.nextInt();
        int length = 0;
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        int j = 2;
       //length =f1+f2;
        //System.out.print(f1+" "+f2);
        for (int i = 2; i < a; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            while (length < a) {


                //System.out.print(" "+f3);
                System.out.println(j);
                length += countNumbers(j);
                j++;



            }
        }
        System.out.println();
        System.out.println("    dlina   " +length);
       System.out.println("\n" + a + "-я цифра последовательности - " + (int) ((j+2) / Math.pow(10, length - a)) % 10);


    }
}
