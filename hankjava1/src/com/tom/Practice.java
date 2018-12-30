package com.tom;

public class Practice {

	public static void main(String[] args) {
		System.out.print("Roman alphabet: ");
		for(char c = 'A';c <='Z'; c++) {
			System.out.print(c);
		}
		System.out.println();
		
		System.out.println(Character.isLetter('c'));
		System.out.println(Character.isLetter('5'));
		
		
		
		
		
		String s = "Hello world";
		String s1 = "Hello world";
		String s2 = new String("Hello world");
		System.out.println(s == s1);
		System.out.println(s == s2);
		System.out.println(s.substring(2));
		System.out.println(s2.substring(5, 11));
		
		for(int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		String s3 = new String("Jack Tom Eric");
//		                        0123456789012
		String name = "Tom";
		int index = s3.indexOf(name);
		System.out.println(index);
		System.out.println(s3.substring(0, index)+"boss"+s3.substring(index+name.length()));
		
	}

}
