package main;

public class Deck extends CardGroup {

	public Deck(int deckSize) {
		for (int i = 0; i < deckSize; i++) {
			this.addCard(new Card());
		}
	}
	
	public Deck() {
		this(24);
	}
}
