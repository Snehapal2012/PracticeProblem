package com.practiceproblem;

import java.util.Scanner;

public class PracticeProblem_LargestAmongThree {
    public static void main(String[] args) {
        int n1,n2,n3;
       Scanner r=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
n1=r.nextInt();
        System.out.print("Enter 2nd number: ");
    n2=r.nextInt();
        System.out.print("Enter 3rd number: ");
        n3=r.nextInt();
        if(n1>=n2 && n1>=n3)
            System.out.println(n1+" is the Largest among three numbers");
        else if (n2>=n1 && n2>=n3)
            System.out.println(n2+" is the Largest among three numbers");
        else System.out.println(n3+" is the Largest among three numbers");
    }
}
