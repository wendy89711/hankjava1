package com.tom;

public class PokerGame2 {

	public static void main(String[] args) {
		int[] n = new int[10];
		Card[] c = new Card[52];
		System.out.println(n[0]);
		c[0] = new Card(7);
		System.out.println(c[0].get());
		
		Poker2 poker = new Poker2();
		poker.shuffle();
		poker.print();
	}

}
