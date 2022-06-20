package com.practiceproblem;

import java.util.Scanner;

public class PracticeProblem_TripletSum0 {
    public static void main(String[] args) {
        int n,i,j,k,count=0;
        boolean res=false;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n= r.nextInt();
        int a[]=new int[n];
        for (i=0;i<n;i++)
        {
            a[i]=r.nextInt();
        }
        for (i=0;i<n-2;i++)
        {
            for (j=i+1;j<n-1;j++)
            {
                for (k=j+1;k<n;k++)
                {
                    if (a[i]+a[j]+a[k] == 0)
                    {
                        count=count+1;
                        System.out.println("Result "+count+": "+a[i]+" "+a[j]+" "+a[k]);
                        res=true;
                    }
                }
            }
        }
        if(res==false)
            System.out.print("Sorry ! these triple's sum is not 0");
        System.out.println("number of distinct triplets: "+count);
    }
}
