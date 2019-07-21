package deckofcards;

public enum Suit {
	CLUBS(1),
	SPADES(2),
	HEARTS(3),
	DIAMONDS(4);
	

	private int value;
	
	private Suit (int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}
