package main;

public class Deck extends CardGroup {

	public Deck() {
		for (int i = 0; i < 24; i++) {
			this.addCard(new Card());
		}
	}
	
}
