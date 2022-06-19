package com.practiceproblem;

import java.util.Scanner;

public class PracticeProblem_LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter year: ");
        int y;
        Scanner r=new Scanner(System.in);
        y=r.nextInt();
        if(((y%4 == 0) && (y%100 != 0 )) || (y%400 == 0)){
            System.out.println("This year is Leap year");
        }else System.out.println("This year is not Leap year");

    }
}
