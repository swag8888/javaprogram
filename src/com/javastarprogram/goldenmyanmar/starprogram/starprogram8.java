package com.javastarprogram.goldenmyanmar.starprogram;

import java.util.Scanner;
public class starprogram8 {
	public static void main(String[]args) 
	{		           
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int rows = sc.nextInt();
		
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
				System.out.println("*");
		}
		sc.close();
	}
}
	
	

