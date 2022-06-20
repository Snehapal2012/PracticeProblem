package com.practiceproblem;

import java.util.Scanner;

public class PracticeProblem_Distance {
    public static void Distance(){
        double x, y;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter X co-ordinate value: ");
        x=r.nextInt();
        System.out.print("Enter Y co-ordinate value: ");
        y=r.nextInt();
        double power_x=Math.pow(x,2);
        double power_y=Math.pow(y,2);
        double distance=Math.sqrt(power_x+power_y);
        System.out.println("Euclidean distance: "+distance);
    }
    public static void main(String[] args) {
Distance();
    }
}
