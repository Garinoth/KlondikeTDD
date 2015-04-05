package main;

public class Card {

	private Suits suit;
	private Integer value;
	
	public boolean isUpturned() {
		return true;
	}

	public Suits getSuit() {
		return this.suit;
	}

	public Integer getValue() {
		return this.value;
	}

}
