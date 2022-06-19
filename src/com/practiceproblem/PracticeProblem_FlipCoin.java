package com.practiceproblem;

import java.util.Random;
import java.util.Scanner;

public class PracticeProblem_FlipCoin {
    public static void main(String[] args) {
        int n,head_count=0,tail_count=0;
        System.out.print("Enter the number of time you want to flip the coin: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=0;i<n;i++) {
            Random random = new Random();
            int flip = random.nextInt(2);
            if (flip < 0.5) {
                tail_count=tail_count+1;
            }else
            {head_count=head_count+1;}
        }
        double heads=head_count/(double)n*100;
        double tails=tail_count/(double)n*100;
        System.out.println("Percentage of Head VS Percentage of Tails: "+heads+"%  VS  "+tails+"%");
    }
}
