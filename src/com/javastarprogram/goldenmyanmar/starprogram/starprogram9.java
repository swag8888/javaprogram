package com.javastarprogram.goldenmyanmar.starprogram;


import java.util.Scanner;

public class starprogram9
{
    public static void main(String[] args)
    {
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows needed to print the pattern ");

        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");
        
       
        for (int i=1; i<=rows; i++)
        {
        	for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
           
            
            for (int k=1; k<=1; k++)
            {
            	if(k==1 || k==rows || i==1 || i==rows) {
            		 System.out.print("*");
            	}
            	else {
            		System.out.print(" ");
            	}
            	
             }
            
            System.out.println();
        }
        scanner.close();
    }
}
