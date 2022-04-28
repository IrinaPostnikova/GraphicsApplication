//package com.company.homeWork.TwoDimArrays;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class qq {
//
//
//
///*
//
//
//    //Задача_1/ Найти минимальный элемент массива /ДВУМЕРНЫЕ МАССИВЫ/
//    public static void task_1() {
//        int n = 5;
//        int m = 6;
//        int a[][] = inputArray(n, m, 0, 100);
//        printArray(a, n, m);
//        int min = a[0][0];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (a[i][j] < min) {
//                    min = a[i][j];
//                }
//            }
//        }
//        System.out.println(min);
//    }
//
//
//    //Задача_2/ Найти максимальный элемент массива
//    public static void task_2() {
//        int n = 5;
//        int m = 6;
//        int a[][] = inputArray(n, m, 0, 100);
//        printArray(a, n, m);
//        int max = a[0][0];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (a[i][j] > max) {
//                    max = a[i][j];
//                }
//            }
//        }
//        System.out.println(max);
//    }
//
//
//    //Задача_3/ Найти индекс минимального элемента массива
//    public static void task_3() {
//        int n = 5;
//        int m = 6;
//        int a[][] = inputArray(n, m, 0, 100);
//        printArray(a, n, m);
//        int min = a[0][0];
//        int minIndexi = 0;
//        int minIndexj = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (a[i][j] < min) {
//                    min = a[i][j];
//                    minIndexi = i;
//                    minIndexj = j;
//                }
//            }
//        }
//        System.out.println("Строка  " + minIndexi + "  Столбец " + minIndexj);
//    }
//
//
//    //Задача_4/ Найти индекс максимального элемента массива
//    public static void task_4() {
//        int n = 5;
//        int m = 6;
//        int a[][] = inputArray(n, m, 0, 100);
//        printArray(a, n, m);
//        int max = a[0][0];
//        int maxIndexi = 0;
//        int maxIndexj = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (a[i][j] > max) {
//                    max = a[i][j];
//                    maxIndexi = i;
//                    maxIndexj = j;
//                }
//            }
//        }
//        System.out.println("Строка  " + maxIndexi + "  Столбец " + maxIndexj);
//
//
//    }
//
//
//    //Задача_5/ Найти количество элементов массива, которые больше всех своих соседей одновременно
//    private static void task_5() {
//        int n = 5;
//        int m = 6;
//        int a[][] = inputArray(n, m, 0, 100);
//        printArray(a, n, m);
//        boolean check;
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                check = true;
//                for (int f = i - 1; f <= i + 1; f++) {
//                    for (int k = j - 1; k <= n; k++) {
//                        if (f > 0 && f < n && k >= 0 && k < m && !(f == i && k == j)) {
//                            if (a[f][k] >= a[i][j]) {
//                                check = false;
//                                break;
//                            }
//                        }
//                    }
//                }
//                if (check) {
//                    count++;
//                    System.out.println(count + "число= " + a[i][j]);
//                    System.out.println("Индекс" + i + " " + j);
//                }
//            }
//        }
//        if (count == 0) {
//            System.out.println("чисел нет");
//        }
//    }
//
//
//    //Задача_6/Отразите массив относительно его главной диагонали
//    private static void task_6() {
//    }
///*
//    /*/Задача_7/ Дана вещественная матрица размерности n * m. По матрице получить логический вектор,
//    присвоив его k-ому элементу значение True , если выполнено указанное условие и значение False иначе:
//            - все элементы k столбца нулевые;
//     - элементы k строки матрицы упорядочены по убыванию;
//     - k строка массива симметрична.
//    private static void task_7() {
//    }
//
//    // TODO: 02.04.2022
//    /*/Задача_8/Дан двухмерный массив A[1..m,1..n].
//    Написать программу построения одномерного массива B[1..m], элементы которого соответственно равны
//    а) суммам элементов строк, б) произведениям элементов строк, в) наименьшим средних арифметических элементов строк.*/
//    private static void task_8() {
//    }
//
//    /*/Задача_9/ В массиве А[1..N,1..N] определить номера строки и столбца какой-нибудь седловой точки.
//    Некоторый элемент массива называется седловой точкой, если он является одновременно наименьшим в своей строке и наибольшим в своем столбце. */
//    private static void task_9() {
//    }
//
//    /*/Задача_10/ Массив А[1..5,1..7] содержит вещественные числа. Требуется ввести целое число K и вычислить сумму элементов А[I,J],
//     для которых I+J=К. Прежде, однако следует убедиться, что значение К позволяет найти решение,
//     в противном случае нужно напечатать сообщение об ошибке.*/
//    private static void task_10() {
//    }
//
//    /*/Задача_11/ Дана матрица NxM. Переставляя ее строки и столбцы, переместить наибольший элемент в верхний левый угол.
//    Определить можно ли таким же образом поместить минимальный элемент в нижний правый угол.     */
//    private static void task_11() {
//    }
//
//    /*/Задача_12/ Заполнить двухмерный массив Т[1..n,1..n] последовательными целыми числами от 1, расположенными по спирали,
//    начиная с левого верхнего угла и продвигаясь по часовой стрелке:*/
//    private static void task_12() {
//    }
//*/
///*
//    //создаем Функцию по созданию массива случайными числами
//    public static int[][] inputArray(int n, int m, int a, int b) {
//        Random random = new Random();
//        int arr[][] = new int[n][m];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = random.nextInt(a, b);
//            }
//
//        }
//        return arr;
//    }
//
//    //создаем Функцию по выводу массива на экран
//    public static void printArray(int[][] arr, int n, int m) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(arr[i][j] + "  ");
//            }
//            System.out.println();
//        }
//
//    }
//
//
//    private static void task_5_var2() {
//        int n = 5;
//        int m = 6;
//        int a[][] = inputArray(n, m, 0, 100);
//        printArray(a, n, m);
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (isLocalMax(a, n, m, i, j)) {
//                    count++;
//                    System.out.println(count + "число= " + a[i][j]);
//                    System.out.println("Индекс" + i + " " + j);
//                }
//            }
//        }
//        if (count == 0) {
//            System.out.println("чисел нет");
//        }
//    }
//
//
//    public static boolean isLocalMax(int arr[][], int n, int m, int i, int j) {
//        int startI = i > 0 ? i - 1 : 0;
//        int endI = i < n - 1 ? i + 1 : n - 1;
//        int startJ = j > 0 ? j - 1 : 0;
//        int endJ = j < m - 1 ? j + 1 : m - 1;
//        for (int f = startI; f <= endI; f++) {
//            for (int k = startJ; k <= endJ; k++) {
//                if (!(f == i && k == j)) {
//                    if (arr[f][k] >= arr[i][j]) {
//                        return false;
//                    }
//                }
//            }
//        }
//        return true;
//    }
//
//}
//}*/
