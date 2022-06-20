package com.practiceproblem;

import java.util.Scanner;

public class PracticeProblem_WindChill {
    public static void WindChill(){
        double t,v,w;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter t value: ");
        t=r.nextInt();
        System.out.print("Enter v value: ");
        v=r.nextInt();
        if(t<50 && (v>3 && v<120)){
         double   p=Math.pow(v,0.16);
         w=35.74+(0.6212*t)+(((0.4275*t)+35.75)*p);
            System.out.println("Wind Chill value: "+w);
        }else System.out.println("Sorry ! Invalid input. Try Again!");
    }
    public static void main(String[] args) {
        WindChill();
    }
}
