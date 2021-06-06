/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package Assignment1.example;


import java.util.Scanner;

public class ex16
{
    public static void main( String[] args )
    {
        System.out.print( "What is your age? " );
        Scanner age = new Scanner(System.in);
        int ageNum = age.nextInt();

        String input = (ageNum >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(input);
    }
}
