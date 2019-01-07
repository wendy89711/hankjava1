package com.tom;

public class StringTester2 {

	public static void main(String[] args) {
		String s = "all pass !";
//	                0123456789	
		String s1 = "all pass !";
		String s2 = new String("all pass !");
		System.out.println(s==s1);
	    System.out.println(s1==s2);
	    System.out.println(s.substring(4));
	    System.out.println(s1.substring(3, 8));
	    for(int i = s2.length()-1;i>=0;i--) {
	    	System.out.print(s2.charAt(i));
	    }
	    System.out.println();
	    System.out.println(s.indexOf('a'));
	    System.out.println(s.lastIndexOf('a'));
	    String s3 = "Cat Dog Rabbit";
//                   01234567890123	    
//	    s3 = s3.replace("Dog", "Cute");
//	    System.out.println(s3);
	    String animal = "Dog";
	    int index = s3.indexOf(animal);
	    System.out.println(index);
	    System.out.println(s3.substring(0, index)+"Cute"+s3.substring(index+animal.length()));
	}
}
