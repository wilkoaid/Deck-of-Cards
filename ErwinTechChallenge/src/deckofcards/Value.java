package deckofcards;

public enum Value {
	ONE(1, "one"),
	TWO(2, "two"),
	THREE(3, "three"),
	FOUR(4, "four"),
	FIVE(5, "five"),
	SIX(6, "six"),
	SEVEN(7, "seven"),
	EIGHT(8, "eight"),
	NINE(9, "nine"),
	JACK(10, "jack"),
	QUEEN(11, "queen"),
	KING(12, "king"),
	ACE(13, "ace");
	
	private int value;
	private String name;
	
	private Value (int value, String name) {
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
