package com.practiceproblem;

import java.util.Scanner;

public class PracticeProblem_HarmonicNumber {
    public static void main(String[] args) {
        double i,n,sum=0;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Number: ");
        n=r.nextInt();
        if(n!=0){
        for(i=1;i<=n;i++){
            sum=sum+(1/i);
        }}else{
                System.out.println("Invalid input !");
            }

        System.out.print("Harmonic value: "+sum);
    }
}
