package com.practiceproblem;

import java.util.Scanner;

public class PracticeProblem_QuotientReminder {
    public static void main(String[] args) {
        int dividend , divisor;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        dividend=r.nextInt();
        System.out.print("Enter Divisor: ");
        divisor=r.nextInt();
        int quotient=dividend/divisor;
        int remainder=dividend%divisor;
        System.out.print(" Quotient: "+quotient);
        System.out.print(" Remainder: "+remainder);
    }
}
