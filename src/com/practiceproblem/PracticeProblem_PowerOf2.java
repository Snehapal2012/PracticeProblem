package com.practiceproblem;

import java.util.Scanner;

public class PracticeProblem_PowerOf2 {
    public static void main(String[] args) {

        int n,i,power=1;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the number of power: ");
        n=r.nextInt();
        for(i=0;i<=n;i++)
        {
            System.out.println("Table of Power 2: 2 ^ "+i+" = "+power);
            power=2*power;
        }
    }
}
