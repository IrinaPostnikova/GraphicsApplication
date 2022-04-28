package com.company.homeWork.TwoDimArrays;

import static com.company.homeWork.TwoDimArrays.Task_1.inputArray;
import static com.company.homeWork.TwoDimArrays.Task_1.printArray;

public class Task_6 {

    //Отразите массив относительно его главной диагонали
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int a[][] = inputArray(n, m, 0, 15);
        printArray(a, n, m);
        int tmp=0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
               tmp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=tmp;
            }

        }
        System.out.println();
        printArray(a, n, m);
    }
}
