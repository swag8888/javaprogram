package com.javastarprogram.goldenmyanmar.starprogram;


import java.util.Scanner;
public class starprogramcross
{
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the odd number");

        int rows = scanner.nextInt();
       
    	for (int i = 1; i <= rows ; i++) {
    		if (i==((rows/2)+1)) {
    			for (int j = 1; j <= rows ; j++) {
    				
    				System.out.print("*");
    			}
			}else {
				for (int k = 1; k <= rows/2; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			
			
			System.out.println();
		}
      
        scanner.close();
    }
}
