package deckofcards;

import java.util.ArrayList;
import java.util.Collections;
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
		List<Card> cards = new ArrayList<>();
		for(int i=0; i<n; i++) {
			if(this.deck.size() > 0) {
				Card topCard = this.deck.remove(this.deck.size() - 1);
				cards.add(topCard);
			}
		}			
		return cards;
	}
	
	public List<Card> sortCards(List<Card> cards) {
		Collections.sort(cards, (o1,o2) -> {
			if(o1.getSuit().getValue() > o2.getSuit().getValue()) {
				return 1;
			} else if (o1.getSuit().getValue() < o2.getSuit().getValue()) {
				return -1;
			} else { // equal suit
				if(o1.getValue().getValue() > o2.getValue().getValue()) {
					return 1;
				} else if (o1.getValue().getValue() < o2.getValue().getValue()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		return cards;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
