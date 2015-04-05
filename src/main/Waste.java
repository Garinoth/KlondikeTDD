package main;

import java.util.ArrayList;

public class Waste extends CardGroup {

	public void addCards(ArrayList<Card> cards) {
		for (Card card : cards) {
			this.addCard(card);
		}
	}

}
