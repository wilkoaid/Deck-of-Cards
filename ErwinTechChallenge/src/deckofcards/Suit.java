package deckofcards;

public enum Suit {
	CLUBS(1, "clubs"),
	SPADES(2, "spades"),
	HEARTS(3, "hearts"),
	DIAMONDS(4, "diamonds");
	

	private int value;
	private String name;
	
	private Suit (int value, String name) {
		this.value = value;
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	
	public String toString() {
		return this.name;
	}
}
