package main;

import java.util.ArrayList;

public class Deck extends CardGroup {

	public Deck(int deckSize) {
		for (int i = 0; i < deckSize; i++) {
			this.addCard(new Card());
		}
	}
	
	public Deck() {
		this(24);
	}

	public ArrayList<Card> drawCards(int amount) {
		assert this.size() >= amount;
		ArrayList<Card> result = new ArrayList<Card>();
		for (int i = 0; i < amount; i++) {
			result.add(this.drawCard());
		}
		return result;
	}

	private Card drawCard() {
		return this.getCards().remove(0);
	}
}
