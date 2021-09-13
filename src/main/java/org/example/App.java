package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Rafael Alvarez-Romero
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print( "What is the first number? " );
        String first = sc.nextLine();
        System.out.printf( "What is the second number? ");
        String second = sc.nextLine();

        int convertedFirst = Integer.parseInt(first);
        int convertedSecond = Integer.parseInt(second);
        int sum = convertedFirst + convertedSecond;
        int subtraction = convertedFirst - convertedSecond;
        int multiplication = convertedFirst * convertedSecond;
        int division = convertedFirst / convertedSecond;

        System.out.println(convertedFirst+" + "+ convertedSecond+" = "+ sum);
        System.out.println(convertedFirst+" - "+ convertedSecond+" = "+ subtraction);
        System.out.println(convertedFirst+" * "+ convertedSecond+" = "+ multiplication);
        System.out.println(convertedFirst+" / "+ convertedSecond+" = "+ division);

    }
}
