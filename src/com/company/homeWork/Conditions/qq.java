//package com.company.homeWork.Conditions;
// Структуры ветвления
//package com.company;
//import jdk.swing.interop.SwingInterOpUtils;
//import java.util.Scanner;
//public class Main {
//
//    public static void main(String[] args) {
//        //  task2_1();
//        //task2_2();
//        //task2_3();
//        //task2_4();
//        // task2_5();
//        //  task2_6();
//        //task2_7_1();
//        // task2_7_2();
//        //task2_7_3();
//        //   task2_7_4();
//    }
//
//    // 2_1 Пользователь вводит 2 числа (A и B). Если A>B, подсчитать A+B, если A=B, подсчитать A*B, если A<B, подсчитать A-B.
//    public static void task1_1() {
//        int A, B, result;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число А ");
//        A = scanner.nextInt();
//        System.out.println("Введите число В ");
//        B = scanner.nextInt();
//        if (A > B) {
//            result = A + B;
//            System.out.println("A+B= " + result);
//        } else if (A == B) {
//            result = A * B;
//            System.out.println("A*B= " + result);
//        } else {
//            result = A - B;
//            System.out.println("A-B= " + result);
//        }
//    }
//
//    // 2_2 Пользователь вводит 2 числа (X и Y). Определить какой четверти принадлежит точка с координатами (X,Y).
//    public static void task1_2() {
//        int X, Y, result;
//        Scanner scanner = new Scanner(System.in);
//        X = scanner.nextInt();
//        Y = scanner.nextInt();
//        if (X == 0 && Y == 0) {
//            System.out.println("точка в начале координат");
//        } else if (X == 0 && Y != 0) {
//            System.out.println("точка на оси абсцисс");
//        } else if (Y == 0 && X != 0) {
//            System.out.println("точка на оси ординат");
//        } else if (X > 0 && Y > 0) {
//            System.out.println("точка в первой четверти");
//        } else if (X < 0 && Y > 0) {
//
//            System.out.println("точка во второй четверти");
//        } else if (X < 0 && Y < 0) {
//
//            System.out.println("точка в третьей четверти");
//        } else {
//            System.out.println("точка в четвертой четверти");
//        }
//
//    }
//
//    // 2_3 Пользователь вводит 3 числа (A, B и С). Выведите их в консоль в порядке возрастания.
//    public static void task1_3() {
//        int a, b, c;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("ВВедите a,b,c");
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        c = scanner.nextInt();
//        if (a > b && b > c) {
//            System.out.println("a>b>c  " + a + " " + b + " " + c);
//
//        } else if (a > c && c > b) {
//            System.out.println("a>c>b  " + a + " " + c + " " + b);
//
//        } else if (b > a & a > c) {
//            System.out.println("b>a>c  " + b + " " + a + " " + c);
//        } else if (b > c & c > a) {
//            System.out.println("b>c>a  " + b + " " + c + " " + a);
//        } else if (c > a & a > b) {
//            System.out.println("c>a>b  " + c + " " + a + " " + b);
//        } else
//            System.out.println("c>b>a  " + c + " " + b + " " + a);
//    }
//
//    //2_4 Пользователь вводит 3 числа (A, B и С). Выведите в консоль решение(значения X) квадратного уравнения стандартного вида, где AX2+BX+C=0
//    public static void task2_4() {
//        int a, b, c;
//        double x, x1, x2;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите a,b,c ");
//        a = sc.nextInt();
//        b = sc.nextInt();
//        c = sc.nextInt();
//        if (a == 0) {
//            System.out.println("не квадратное уравнение");
//        }
//        double d = (b * b - 4 * a * c);
//        if (d < 0) {
//            System.out.println("нет корней");
//        } else if (d == 0) {
//            x = -b / 2 * a;
//            System.out.println("Одно решение х=   " + x);
//        } else {
//            x1 = -b + (Math.sqrt(d)) / 2 * a;
//            x2 = -b - (Math.sqrt(d)) / 2 * a;
//            System.out.println("x1= " + x1 + "   x2= " + x2);
//
//        }
//    }
//
//    //2_5 Пользователь вводит двузначное число. Выведите в консоль прописную запись этого числа.
//    //Например при вводе “25” в консоль будет выведено “двадцать пять”.
//    public static void task2_5() {
//        int a;
//        Scanner s = new Scanner(System.in);
//        a = s.nextInt();
//        if (a < 9 && a < 20) {
//
//            switch (a) {
//                case 10:
//                    System.out.println("Ten  ");
//                    break;
//                case 11:
//                    System.out.println("eleven  ");
//                    break;
//                case 12:
//                    System.out.println("twelve  ");
//                    break;
//                case 13:
//                    System.out.println("thirteen  ");
//                    break;
//                case 14:
//                    System.out.println("fourteen  ");
//                    break;
//                case 15:
//                    System.out.println("fifteen  ");
//                    break;
//                case 16:
//                    System.out.println("Sixteen  ");
//                    break;
//                case 17:
//                    System.out.println("Seventeen  ");
//                    break;
//                case 18:
//                    System.out.println("eighteen  ");
//                    break;
//                case 19:
//                    System.out.println("nineteen  ");
//                    break;
//            }
//
//
//        } else if (a >= 10 && a < 100) {
//            int b = a / 10;
//
//
//            switch (b) {
//                case 2:
//                    System.out.println("Twenty  ");
//                    break;
//                case 3:
//                    System.out.println("Thirty  ");
//                    break;
//                case 4:
//                    System.out.println("Fourty  ");
//                    break;
//                case 5:
//                    System.out.println("Fifty  ");
//                    break;
//                case 6:
//                    System.out.println("Sixty  ");
//                    break;
//                case 7:
//                    System.out.println("Seventy  ");
//                    break;
//                case 8:
//                    System.out.println("Eighty  ");
//                    break;
//                case 9:
//                    System.out.println("Ninety  ");
//                    break;
//            }
//            int c = a % 10;
//            switch (c) {
//
//                case 1:
//                    System.out.println("One  ");
//                    break;
//                case 2:
//                    System.out.println("Two  ");
//                    break;
//                case 3:
//                    System.out.println("Three  ");
//                    break;
//                case 4:
//                    System.out.println("Four  ");
//                    break;
//                case 5:
//                    System.out.println("Five ");
//                    break;
//                case 6:
//                    System.out.println("Six  ");
//                    break;
//                case 7:
//                    System.out.println("Seven  ");
//                    break;
//                case 8:
//                    System.out.println("Eight  ");
//                    break;
//                case 9:
//                    System.out.println("Nine  ");
//                    break;
//            }
//
//
//        } else {
//            System.out.println("Введенное число не является двузначным");
//        }
//
//    }
//
//    //2_6 Определить, попадает ли точка M(x,y) в круг радиусом r с центром в точке (x0,y0)
//    public static void task2_6() {
//        int x0, y0, x, y, r;
//        Scanner s = new Scanner(System.in);
//        System.out.println("введите координаты центра окружности");
//        x0 = s.nextInt();
//        y0 = s.nextInt();
//        System.out.println("введите координаты точки");
//        x = s.nextInt();
//        y = s.nextInt();
//        System.out.println("введите длину радиуса окружности");
//        r = s.nextInt();
//        double length = Math.sqrt((Math.pow(x - x0, 2) + Math.pow(y - y0, 2)));
//        if (r > length) {
//            System.out.println("точка внутри окружности");
//        } else if (r == length) {
//            System.out.println("точка на окружности");
//        } else {
//            System.out.println("точка вне окружности");
//        }
//
//    }
//
//
//    //2_7 Написать программу, которая печатает True или False в зависимости от того, выполняются или нет заданные условия:
//    //_1 квадрат заданного трехзначного числа равен кубу суммы цифр этого числа;
//    //_2 сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр;
//    //_3 среди цифр заданного трехзначного числа есть одинаковые;
//    //_4 среди первых трех цифр из дробной части заданного положительного вещественного числа есть цифра 0.
//    public static void task2_7_1() {
//        int a1, a2, a3;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите трехзначное число");
//        int a = scanner.nextInt();
//        while (a / 100 < 1 || a / 100 > 9) {
//            System.out.println("Введите трехзначное число");
//            a = scanner.nextInt();
//        }
//        a1 = a % 10;
//        a2 = (a / 10) % 10;
//        a3 = (a / 100) % 10;
//        if (a * a == Math.pow((a1 + a2 + a3), 3)) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
//        //System.out.println(a1);
//        // System.out.println(a2);
//        // System.out.println(a3);
//    }
//
//    public static void task2_7_2() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите четырехзначное число");
//        int a = scanner.nextInt();
//        while (a / 1000 < 1 || a / 1000 > 9) {
//            System.out.println("Введите четырехзначное число");
//            a = scanner.nextInt();
//        }
//        int a1 = a / 1000;
//        int a2 = (a / 100) % 10;
//        int a3 = (a / 10) % 10;
//        int a4 = a % 10;
//        if ((a1 + a2) == (a3 + a4)) {
//            System.out.println("True");
//        } else System.out.println("False");
//
//
//    }
//
//    public static void task2_7_3() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите трехзначное число");
//        int a = scanner.nextInt();
//        while (a / 100 < 1 || a / 100 > 9) {
//            System.out.println("Введите трехзначное число");
//            a = scanner.nextInt();
//        }
//        int a1 = a % 10;
//        int a2 = (a / 10) % 10;
//        int a3 = (a / 100) % 10;
//        if (a1 == a2 || a2 == a3 || a3 == a1) {
//            System.out.println("True");
//        } else System.out.println("False");
//    }
//
//    public static void task2_7_4() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите положительное число");
//        double a = scanner.nextDouble();
//        while (a < 0) {
//            System.out.println("Введите положительное число");
//            a = scanner.nextDouble();
//        }
//        double a1 = (a * 1000) % 10;
//        int b1 = (int) a1;
//        System.out.println(b1);
//        double a2 = (a * 100) % 10;
//        int b2 = (int) a2;
//        System.out.println(b2);
//        double a3 = (a * 10) % 10;
//        int b3 = (int) a3;
//        System.out.println(b3);
//        if (b1 == 0 || b2 == 0 || b3 == 0) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
//    }
//
//
////}