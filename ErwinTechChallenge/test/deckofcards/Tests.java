package deckofcards;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Tests {

	/*
	 * Test that the deck is the same size after shuffling 
	 */
	@Test
	public void test1() {
		Deck deck = new Deck();
		deck.shuffleDeck();
		int expected = 52;
		int actual = deck.getDeck().size();
		assertEquals(expected,actual);
	}

	
	@Test
	public void test2() {
		Deck deck = new Deck();
		Card jackD = new Card(Value.JACK, Suit.DIAMONDS);
		Card queenD = new Card(Value.QUEEN, Suit.DIAMONDS);
		Card kingD = new Card(Value.KING, Suit.DIAMONDS);
		Card aceD = new Card(Value.ACE, Suit.DIAMONDS);
		List<Card> expected = new ArrayList<>();
		expected.add(jackD);
		expected.add(queenD);
		expected.add(kingD);
		expected.add(aceD);
		
		List<Card> actual = deck.draw(4);
		for(int i=0; i<expected.size(); i++) {
			assertEquals(expected.get(i),actual.get(i));
		}
	}
}
