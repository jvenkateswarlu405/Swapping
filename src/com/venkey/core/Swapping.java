package com.venkey.core;

public class Swapping {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		/*
		 * System.out.println("Before Swapping: a= "+a+"\tb= "+b); a = a + b; b = a - b;
		 * a = a - b; System.out.println("After Swapping : a =" + a + "\tb =" + b);
		 * 
		 * 
		 * System.out.println("Before Swapping: a= " + a + "\tb= " + b); a = a * b; b =
		 * a / b; a = a / b; System.out.println("After Swapping : a= " + a + "\tb= " +
		 * b);
		 */
		System.out.println("Before Swapping: a= "+a+"\tb= "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping : a= "+a+"\tb= "+b);
	}

}
