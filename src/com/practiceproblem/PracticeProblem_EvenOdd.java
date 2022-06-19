package com.practiceproblem;

import java.util.Scanner;

public class PracticeProblem_EvenOdd {
    public static void main(String[] args) {
        int n;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter number: ");
        n=r.nextInt();
        if(n%2==0)
            System.out.print("Number is Even Number !");
        else System.out.print("Number is Odd Number !");
    }
}
