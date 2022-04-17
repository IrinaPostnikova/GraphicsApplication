package com.company.homeWork.Cycles;

public class Task_17_1 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 10; i < 100; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
             result = a + b ;
            if (result == i) {
                System.out.println(result);
            }
        }
    }
}
