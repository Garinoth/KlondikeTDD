package main;

import java.util.ArrayList;

public class CardGroup {

	private ArrayList<Card> cards;
	
	public CardGroup() {
		this.cards = new ArrayList<Card>();
	}

	public boolean isEmpty() {
		return this.cards.isEmpty();
	}
	
	public int size() {
		return this.cards.size();
	}

	public ArrayList<Card> getCards() {
		return cards;
	}
	
	public void addCard(Card card) {
		this.cards.add(card);
	}
	
	public void addCards(ArrayList<Card> cards) {
		for (Card card : cards) {
			this.addCard(card);
		}
	}
	
	private Card drawCard() {
		return this.getCards().remove(0);
	}
	
	public ArrayList<Card> drawCards(int amount) {
		assert this.size() >= amount;
		ArrayList<Card> result = new ArrayList<Card>();
		for (int i = 0; i < amount; i++) {
			result.add(this.drawCard());
		}
		return result;
	}
}
