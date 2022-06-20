package com.practiceproblem;


import java.util.Scanner;

public class PracticeProblem_Quadratic {
    public static void Quadratic(){
        double a,b,c,delta;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a=r.nextInt();
        System.out.print("Enter value of b: ");
        b= r.nextInt();
        System.out.print("Enter value of c: ");
        c=r.nextInt();
        delta=b*b-4*a*c;
        double root1=(-b+Math.sqrt(delta))/(2*a);
        double root2=(-b-Math.sqrt(delta))/(2*a);
        System.out.println("1st root of the equation: "+root1);
        System.out.println("2nd root of the equation: "+root2);
    }

    public static void main(String[] args) {
        Quadratic();
    }
}
