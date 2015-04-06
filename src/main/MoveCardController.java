package main;

import java.util.Stack;

public class MoveCardController {
	
	private Deck deck;
	private Waste waste;
	
	public MoveCardController(int deckSize) {
		
		this.deck = new Deck(deckSize);
		this.waste = new Waste();
	}

	public void moveFromDeckToWaste() {
		if (this.deck.size() >= 3) {
			Stack<Card> cards = this.deck.drawCards(3);
			this.waste.addCards(cards);
		} else if (this.deck.size() == 2){
			Stack<Card> cards = this.deck.drawCards(2);
			this.waste.addCards(cards);
		} else if (this.deck.size() == 1){
			Stack<Card> cards = this.deck.drawCards(1);
			this.waste.addCards(cards);
		}
	}

	public int getDeckSize() {
		return this.deck.size();
	}

	public int getWasteSize() {
		return this.waste.size();
	}

	public void moveFromWasteToFoundation(Foundation foundation) {
		if (foundation.acceptsCard(this.waste.peek())) {
			foundation.addCard(this.waste.drawCard());
		}
	}

	public CardGroup getWaste() {
		return this.waste;
	}

	public void addCardToWaste(Card card) {
		this.getWaste().addCard(card);
	}

}
