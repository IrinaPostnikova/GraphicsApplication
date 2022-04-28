package com.company.homeWork.TwoDimArrays;

import static com.company.homeWork.TwoDimArrays.Task_1.printArray;

public class Task_12 {
    public static void main(String[] args) {
        int n = 6;
        int m = 6;
        int[][] a = new int[n][m];

        int j;
        int i = 0;
        int k = 0;
        int p = 1;
        while (i < n*m) {
            k++;
            for (j = k-1; j<m-k+1; j++) {
                a[k-1][j] = p++;
                i++;
            }
            for (j = k; j<n-k+1; j++){
                a[j][m-k] = p++;
                i++;
            }
            for (j = m-k-1; j>=k-1; j--){
                a[n-k][j] = p++;
                i++;
            }
            for (j = n-k-1; j>=k; j--){
                a[j][k-1]=p++;
                i++;
            }
        }
        printArray(a,n,m);
    }
}
