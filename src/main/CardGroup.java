package main;

import java.util.ArrayList;
import java.util.Stack;

public class CardGroup {

	private Stack<Card> cards;
	
	public CardGroup() {
		this.cards = new Stack<Card>();
	}

	public boolean isEmpty() {
		return this.cards.isEmpty();
	}
	
	public int size() {
		return this.cards.size();
	}

	public Stack<Card> getCards() {
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
	
	public Card peekCard() {
		return this.getCards().peek();
	}
	
	public Stack<Card> peekCards(int amount) {
		assert this.size() >= amount;
		Stack<Card> result = new Stack<Card>();
		for (int i = 0; i < amount; i++) {
			result.add(this.peekCard());
		}
		return result;
	} 
	
	public Card drawCard() {
		return this.getCards().pop();
	}
	
	public Stack<Card> drawCards(int amount) {
		assert this.size() >= amount;
		Stack<Card> result = new Stack<Card>();
		for (int i = 0; i < amount; i++) {
			result.add(this.drawCard());
		}
		return result;
	}
}
