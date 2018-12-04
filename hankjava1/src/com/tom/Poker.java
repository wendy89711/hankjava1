package com.tom;

public class Poker {
//	int[] cards = new int [52];
	Card[] cards = new Card[52];
	public Poker(){
		for (int i=0; i<52; i++){
//			cards[i] = i;
			cards[i] = new Card(i);
		}
	}
	
	public void print(){
		for (int i=0; i<52; i++){
	
			System.out.print(cards[i].get() + " ");
			if(i%13 == 12)
				System.out.println();
		}
	}
}
