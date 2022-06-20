package com.practiceproblem;

import java.util.Scanner;

public class PracticeProblem_2DArray {
    public static void main(String[] args) {
        int m,n;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        m=r.nextInt();
        System.out.print("Enter the number of columns: ");
        n=r.nextInt();
        System.out.print("Enter the elements of row: ");
        int a[][]=new int[m][n];
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++){
                a[i][j]=r.nextInt();
            }
        }
        for (int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
