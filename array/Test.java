package com.te.array;

public class Test {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5,5};
	System.err.println(a.length);
	int []b;
	b=new int[4];
//	for (int i = 0; i < b.length; i++) {
//		b[i]=i+1;
//		System.out.println(b[i]);
//		
	Test []s;
	s=new Test[3];
	Test test = new Test();
	Test test2 = new Test();
	Test test3 = new Test();
	s[0]=test;
	s[1]=test2;
	s[2]=test3;
	
	Object object = new Object();
	
	Object[]array;
	array=new Object [4];
	array[0]=test;
	array[1]=object;;
	}
}

