package com.practiceproblem;

import java.util.Scanner;

public class PracticeProblem_VowelConsonant {
    public static void main(String[] args) {
        char s;
        System.out.print("Enter character: ");
        Scanner r=new Scanner(System.in);
        s=r.next().charAt(0);;
        switch (s){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }

    }

}
