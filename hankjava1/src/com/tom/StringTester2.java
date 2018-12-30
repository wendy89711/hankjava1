package com.tom;

public class StringTester2 {

	public static void main(String[] args) {
		String s = "Concerntrate and Fight";
		//          0123456789012345678901
		String s1 = "Concerntrate and Fight";
		String s2 = new String("Concerntrate and Fight");
		System.out.println(s==s1);
		System.out.println(s1==s2);
		System.out.println(s.substring(17));
		System.out.println(s1.substring(0, 12));
		for(int i = s.length()-1; i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println(s2.indexOf('e'));
		System.out.println(s1.lastIndexOf('e'));
		String s3 = "Wendy Cindy Judy";
		s3 = s3.replace("Wendy", "Good");
		System.out.println(s3);
		
	}
}
