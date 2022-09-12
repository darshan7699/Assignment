package com.te.array;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many numbers you want to print fibonancci series:");
		int n=scanner.nextInt();
		int n1=0;
		int n2=1;
		int count=n;
		int n3;
		int i=1;
		while (i<=count) {
			System.out.println(n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
			i++;
		}
		
		
		scanner.close();
	 }
	}

