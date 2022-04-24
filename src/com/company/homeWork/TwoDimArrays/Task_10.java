package com.company.homeWork.TwoDimArrays;

import java.util.Scanner;

import static com.company.homeWork.TwoDimArrays.Task_1.inputArray;
import static com.company.homeWork.TwoDimArrays.Task_1.printArray;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        int m = 7;
        int sum = 0;
        System.out.println("Введите k");
        int k = scanner.nextInt();
        if ((k<0) || (k>m+n)) {
            System.out.print("\nВведи другое число");
        }
        else {
            int a[][] = inputArray(n,m,0,10);
            printArray(a,n,m);
            for (int i = 0; i<n; i++){
                for (int j = 0; j<m; j++){
                    if (i+j==k){
                        System.out.print("\nИндексы: " + i + " " + j + ";");
                        sum += a[i][j];
                    }
                }
            }
            System.out.print("\nСумма элементов = "+ sum);
        }
    }
    }

