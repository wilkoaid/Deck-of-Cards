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

	/*
	 * test the draw method
	 */
	@Test
	public void test2() {
		Deck deck = new Deck();
		Card jackD = new Card(Value.JACK, Suit.DIAMONDS);
		Card queenD = new Card(Value.QUEEN, Suit.DIAMONDS);
		Card kingD = new Card(Value.KING, Suit.DIAMONDS);
		Card aceD = new Card(Value.ACE, Suit.DIAMONDS);
		List<Card> expected = new ArrayList<>();
		expected.add(aceD);
		expected.add(kingD);
		expected.add(queenD);
		expected.add(jackD);
		
		List<Card> actual = deck.draw(4);
		for(int i=0; i<expected.size(); i++) {
			assertEquals(expected.get(i).toString(), actual.get(i).toString());
		}
	}
	
	/*
	 * test the sort method
	 */
	@Test
	public void test3() {
		Deck deck = new Deck();
		List<Card> cards = new ArrayList<>();
		Card fourC = new Card(Value.FOUR, Suit.CLUBS);
		cards.add(fourC);
		Card oneC = new Card(Value.ONE, Suit.CLUBS);
		cards.add(oneC);
		Card twoC = new Card(Value.TWO, Suit.CLUBS);
		cards.add(twoC);
		Card jackH = new Card(Value.JACK, Suit.HEARTS);
		cards.add(jackH);
		Card queenS = new Card(Value.QUEEN, Suit.SPADES);
		cards.add(queenS);
		Card aceD = new Card(Value.ACE, Suit.DIAMONDS);
		cards.add(aceD);
		
		List<Card> expected = new ArrayList<>();
		expected.add(oneC);
		expected.add(twoC);
		expected.add(fourC);
		expected.add(queenS);
		expected.add(jackH);
		expected.add(aceD);
		
		List<Card> actual = deck.sortCards(cards);
		
		for(int i=0; i<expected.size(); i++) {
			assertEquals(expected.get(i).toString(), actual.get(i).toString());
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
