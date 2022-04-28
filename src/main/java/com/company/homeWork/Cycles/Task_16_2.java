package com.company.homeWork.Cycles;

public class Task_16_2 {
    public static void main(String[] args) {
        double d;
        d = 0.00000000001;
        double b = 1.0 * 3 / 4;
        System.out.println("точность =  " + d + "  точное значение =  " + b);

        int i = 1;
        double sum = 0;
        double a = 1.0 * 1 / (i * (i + 2));
        while (a >= d) {
            sum = sum + a;
            i++;
            a = 1.0 * 1 / (i * (i + 2));
        }
        System.out.println("Приближенное начение бесконечной суммы =  " + sum);
    }
}
