package main;
import java.util.ArrayList;


public class StartController {

	private final int FOUNDATIONS = 4;
	private final int TABLEAUS = 7;
	
	private ArrayList<Foundation> foundations;
	private Waste waste;
	private ArrayList<Tableau> tableaus;
	private Deck deck;
	
	public StartController() {
		this.foundations = new ArrayList<Foundation>();
		for (int i = 0; i < FOUNDATIONS; i++) {
			this.foundations.add(new Foundation());
		}
		
		this.waste = new Waste();
		
		this.tableaus = new ArrayList<Tableau>();
		for (int i = 0; i < TABLEAUS; i++) {
			Tableau tableau = new Tableau();
			for (int j = 0; j < i+1; j++) {
				tableau.addCard(new Card());
			}
			this.tableaus.add(tableau);
		}
		
		this.deck = new Deck();
	}
	
	public boolean isEmptyAllFoundation() {
		boolean result = true;
		for (Foundation foundation : this.getFoundations()) {
			result = result && foundation.isEmpty();
		}
		return result;
	}

	private ArrayList<Foundation> getFoundations() {
		return this.foundations;
	}

	public boolean isEmptyWaste() {
		return this.getWaste().isEmpty();
	}
	
	private Waste getWaste() {
		return this.waste;
	}

	public ArrayList<Card> peeksEachTableau() {
		ArrayList<Card> peeksEachTableau = new ArrayList<Card>();
		for (Tableau tableau : tableaus) {
			peeksEachTableau.add(tableau.peek());
		}
		return peeksEachTableau;
	}

	public Object getDeckSize() {
		return this.deck.size();
	}

	public ArrayList<Integer> getSizeEachTableau() {
		ArrayList<Integer> sizeEachTableau = new ArrayList<Integer>();
		for (Tableau tableau : tableaus) {
			sizeEachTableau.add(tableau.size());
		}
		return sizeEachTableau;
	}

}
