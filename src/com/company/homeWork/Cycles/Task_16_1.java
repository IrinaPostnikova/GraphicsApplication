package com.company.homeWork.Cycles;

public class Task_16_1 {
    public static void main(String[] args) {

        double d;
        d = 0.000000000000001;

        double b = Math.pow(Math.PI, 2) / 6;
        System.out.println("точность =  " + d + "  точное значение =  " + b);
        int i = 1;
        double sum = 0;
        double a = 1;
        while (a >= d) {
            sum = sum + a;
            i++;
            a = 1 / (double) Math.pow(i, 2);
        }
        System.out.println("Приближенное начение бесконечной суммы =  " + sum);

    }
}

