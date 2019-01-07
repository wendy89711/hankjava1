package com.tom;

import java.util.Random;

public class PokerGame2 {

	public static void main(String[] args) {
		int[] p = new int[10];
		Card[] c = new Card[52];
		System.out.println(p[4]);
		System.out.println(c[4]);
		p[6] = 3;
		System.out.println(p[6]);
		c[31] = new Card(3);
		System.out.println(c[31].get());
		
		Poker2 poker = new Poker2();
		poker.shuffle();
		poker.print();
	}
}