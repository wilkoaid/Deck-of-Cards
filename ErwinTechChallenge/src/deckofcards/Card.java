package deckofcards;

public class Card {
	private final Suit suit;
	private final Value value;
	
	
	public Card (Value value, Suit suit) {
		this.value = value;
		this.suit = suit;
	}


	public Suit getSuit() {
		return suit;
	}


	public Value getValue() {
		return value;
	}
	
	public String toString() {
		return this.value + " of " + this.suit;
	}
}
