package com.tom;

import java.util.Random;

public class PokerGame2 {

	public static void main(String[] args) {
		int[] i = new int[10];
		Card[] c = new Card[52];
		System.out.println(i[5]);
		System.out.println(c[43]);
		i[5] = 4;
		System.out.println(i[5]);
		c[43] = new Card(4);
		System.out.println(c[43].get());
		
		Poker2 poker = new Poker2();
		poker.shuffle();
		poker.print();
	}
}