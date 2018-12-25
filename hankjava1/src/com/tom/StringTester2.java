package com.tom;

public class StringTester2 {

	public static void main(String[] args) {
		String s = "Hello world";
		String s1 = "Hello world";
		String s2 = new String("Hello world");
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s.substring(2));
		System.out.println(s2.substring(5, 11));
		
		
		System.out.print("Roman alphabet: ");
		for (char c = 'A'; c <= 'Z'; c++) {
		System.out.print(c);
		}
		System.out.println();

	}

}
