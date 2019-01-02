package com.tom;

public class StringTester {

	public static void main(String[] args) {
		String s = "Hello world";
		String s1 = "Hello world";
		System.out.println(s == s1);
		System.out.println(s.substring(3));
		System.out.println(s.substring(0,11));
		
		for(int i = s.length()-1;i>=0; i--){
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		
		String s2 = new String("Jack Tom Eric");
//		                        0123456789012
//		s2 = s2.replace("Tom", "boss");
//		System.out.println(s2);
		
		String name = "Tom";
		int index = s2.indexOf(name);
		System.out.println(index);
		System.out.println(s2.substring(0, index)+"boss"+s2.substring(index+name.length()));
		
		int nn = Integer.parseInt("12");
		float f = Float.parseFloat("45.3");
		nn++;
		System.out.println(nn);
		System.out.println(f);
	}

}
