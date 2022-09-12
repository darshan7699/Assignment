package com.te.array;

import java.util.Scanner;

public class ArrayLength {
		public void array(int length) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter array elements:");
			int a[]=new int[length];
			for (int i = 0; i < a.length; i++) {
				a[i]=scanner.nextInt();
		}
			int b[]=new int[length];
			
			for (int i = 0; i < b.length; i++) {
				b[i]=a[i];
				System.out.println(b[i]);
			}
			
			scanner.close();
		}
	    
	     public static void main(String[] args) {
	    	 
	    	 Scanner scanner=new Scanner(System.in);
			System.out.println("Enter length of an array:");
			int a=scanner.nextInt();
			ArrayLength arrayLength=new ArrayLength();
			arrayLength.array(a);
			scanner.close();
		}
	}

