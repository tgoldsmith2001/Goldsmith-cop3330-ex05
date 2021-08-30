/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String Str1="";
        String Str2="";
        Scanner input= new Scanner(System.in);
        System.out.print("What is the first number? ");
        Str1=input.nextLine();
        System.out.print("What is the second number? ");
        Str2=input.nextLine();
        int a= Integer.parseInt(Str1);
        int b= Integer.parseInt(Str2);
        System.out.println(Str1+" + "+Str2+" = "+(a+b));
        System.out.println(Str1+" - "+Str2+" = "+(a-b));
        System.out.println(Str1+" * "+Str2+" = "+(a*b));
        System.out.println(Str1+" / "+Str2+" = "+(a/b));
    }
}