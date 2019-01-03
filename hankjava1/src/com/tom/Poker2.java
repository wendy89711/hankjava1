package com.tom;

import java.util.Random;

public class Poker2 {
	Card[] cards = new Card[52];
	
	public Poker2() {
		for(int i = 0; i<52; i++) {
			cards[i] = new Card(i);
		}
	}
	public void shuffle() {
		for(int i = 0; i <52; i++) {
			int r = new Random().nextInt(52);
			Card tmp = cards[i];
			cards[i] = cards[r];
			cards[r] = tmp;
		}
	}
	public void print() {
		for(int i =0; i<52; i++) {
			System.out.print(cards[i].get()+" ");
			if(i%13 == 12)
				System.out.println();
		}
	}
	

}
