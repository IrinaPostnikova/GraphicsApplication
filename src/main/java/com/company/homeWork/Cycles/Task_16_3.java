package com.company.homeWork.Cycles;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

import static com.company.homeWork.Cycles.Task_18.factorial;

public class Task_16_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите х");
        double x = s.nextInt();

        double e = Math.exp(x);
        System.out.println("Точное значение  =  " + e);
        double d = 0.000001;
        System.out.println("Точность  =  " + d);

        double sum=0;
        int i=0;
        double a=1;

        while (a >=d){
            sum=sum+a;
            i++;
            a= a*x/i;
        }
        System.out.println("Приближенное начение бесконечной суммы =  "+sum);
    }
}
