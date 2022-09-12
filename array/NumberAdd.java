package com.te.array;

import java.util.Scanner;

public class NumberAdd {
	public static void main(String[] args) {
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Numbers you want to addw");
		int n = scanner.nextInt();
		int a[]= new int[n];
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
			System.out.println(sum);
		}
		
		scanner.close();
	}
	}

