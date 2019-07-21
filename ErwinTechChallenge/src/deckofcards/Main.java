package deckofcards;

public class Main {

	public static void main(String[] args) {
		Deck deck = new Deck();
		int i = 0;
		for(Card card : deck.getDeck()) {
			System.out.println(card);
			i++;
		}
		System.out.println(i);
		System.out.println("\n \n \n");
		deck.shuffleDeck();
		
		i = 0;
		for(Card card : deck.getDeck()) {
			System.out.println(card);
			i++;
		}
		System.out.println(i);
	}

}
