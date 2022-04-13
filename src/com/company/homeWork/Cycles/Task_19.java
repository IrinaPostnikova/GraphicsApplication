package com.company.homeWork.Cycles;

public class Task_19 {
    public static void main(String[] args) {

        //Пользователь вводит 2 числа (A и B). Вывести сумму всех чисел из диапазона от A до B,
        // которые делятся без остатка на 7. (Учтите, что при вводе B может оказаться меньше A).

    /*  public static void task5() {
          int a, b;
          Scanner s = new Scanner(System.in);
          a = s.nextInt();
          b = s.nextInt();
          int sum =0;
          if (a > b) {
              int c = a;
              b = c;

              for (int i = a; i <= b; i++) {
                  if (i % 7 ==0)
                      sum += i;
                  }
              }System.out.println("сумма=  " + sum);
          }*/
 /* public static void task8(){

  }*/
/*//Можно ли заданное натуральное число М представить в виде суммы квадратов двух натуральных чисел?
// Написать программу решения этой задачи.
    public static void task19() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean flag = false;
        for (int i = 1; i <= Math.sqrt(a); i++) {
            for (int j = i; j <= Math.sqrt(a); j++) {
                if (i * i + j * j == a) {
                    System.out.println("Можно");
                    flag = true;
                    break;
                }

            }
            if (flag) break;


        }
        if (!flag)
            System.out.println("нельзя");

    }*/


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
