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
		boolean result = false;
		if (card.getSuit() == this.getSuit()) {
			if (!this.getCards().isEmpty()) {
				result = card.getValue() == this.peek().getValue() + 1;
			} else {
				result = card.getValue() == 1;
			}
		}
		return result;
		
	}}
