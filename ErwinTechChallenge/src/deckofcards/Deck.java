package deckofcards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	private List<Card> deck;
	
	public Deck () {
		this.deck = new ArrayList<>();
		// populate deck
		for(Suit suit : Suit.values()) {
			for(Value value : Value.values()) {
				this.deck.add(new Card(value, suit));
			}
		}
	}
	
	public List<Card> getDeck() {
		return deck;
	}

	public void shuffleDeck() {
		List<Card> shuffled = new ArrayList<>();
		int i = 0;
		while(i < deck.size()) {
			Random rand = new Random();
			int n = rand.nextInt(deck.size());
			Card card = this.deck.get(n);
			if(!shuffled.contains(card)) {
				shuffled.add(this.deck.get(n));
				i++;
			}
		}
		this.deck = shuffled;
	}
	
	public List<Card> draw(int n) {
		return deck;
	}
	
	public List<Card> drawSorted(int n) {
		return deck;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
