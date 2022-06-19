package com.practiceproblem;

import java.util.Scanner;

public class PracticeProblem_Swaping {
    public static void main(String[] args) {
        int temp=0, a,b;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        a=r.nextInt();
        System.out.print("Enter 2nd number: ");
        b=r.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping 1st number: "+a);
        System.out.println("After swapping 2nd number: "+b);
    }
}
