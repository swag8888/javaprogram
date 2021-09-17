package com.javastarprogram.goldenmyanmar.starprogram;

import java.util.Scanner;
public class starprogram2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number the number: "); 
        int rows = sc.nextInt();
         
        for (int i= 0; i<= rows; i++)
        {
            for (int j=1; j<=rows-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<i;k++)
            {
                System.out.print("*");
            } 
                System.out.println("");
        }
        sc.close();
 
    }
}
