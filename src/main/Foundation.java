package main;

public class Foundation extends CardGroup {
	
	private Suits suit;
	
	public Foundation(Suits suit) {
		this.suit = suit;
	}

	public Suits getSuit() {
		return suit;
	}

	public boolean acceptsCard(Card card) {
		return card.getSuit() == this.getSuit() && card.getValue() == this.peekTopCard().getValue() + 1;
	}	
}
