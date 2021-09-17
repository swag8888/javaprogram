package com.javastarprogram.goldenmyanmar.starprogram;

import java.util.Scanner;
public class starprogram1 {
	 public static void main(String[]args) {
		 
		
		 System.out.print("Enter the number you want to print:");
		 Scanner sc = new Scanner(System.in);
		 int row = sc.nextInt();
		
		 
		 for (int i = 1; i <= row; i++)
		 {
		 for (int j=row; j>i; j--)
		 {
		 System.out.print(" ");
		 }
		 for (int k=1; k<=(i * 2) -1; k++)
		 {
		 System.out.print("*");
		 }
			System.out.println("");
		}
		 sc.close();
		 
	}
	}

