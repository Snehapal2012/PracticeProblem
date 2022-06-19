package com.practiceproblem;

import java.util.Scanner;

public class PracticeProblem_PrimeFactor {
    public static void main(String[] args) {
        int i, n;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Number: ");
        n=r.nextInt();
        for(i=2;i<n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }if(n>2)
        {
            System.out.println(n);
        }
    }
}
