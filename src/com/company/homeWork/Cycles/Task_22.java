package com.company.homeWork.Cycles;

import java.util.Scanner;



public class Task_22 {
    public static int countNumbers(int a) {
        int count=0;
//        int b=0;
        while (a!=0){
           a/=10;

            count++;
        }
        return count;
    }



    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int length=0;
        int i=1;

        while (length<a){
            int b=i*i;
            System.out.print(b);

            length+=countNumbers(i);
            i++;
        }
        System.out.println("длина"+length);
//System.out.println("\n"+a+"-я цифра последовательности - "+(int)((i)/Math.pow(10,length-a))%10);
    }
}
