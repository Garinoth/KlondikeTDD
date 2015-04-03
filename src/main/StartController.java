package main;
import java.util.ArrayList;


public class StartController {

	private final int FOUNDATIONS = 4;
	private final int TABLEAUS = 4;
	
	private ArrayList<Foundation> foundations;
	private ArrayList<Card> waste;
	private ArrayList<Tableau> tableaus;
	
	public StartController() {
		this.foundations = new ArrayList<Foundation>();
		for (int i = 0; i < FOUNDATIONS; i++) {
			this.foundations.add(new Foundation());
		}
		
		this.waste = new ArrayList<Card>();
		
		this.tableaus = new ArrayList<Tableau>();
		for (int i = 0; i < TABLEAUS; i++) {
			this.tableaus.add(new Tableau());
		}
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
	
	private ArrayList<Card> getWaste() {
		return this.waste;
	}

	public ArrayList<Card> peeksEachTableau() {
		ArrayList<Card> peeksEachTableau = new ArrayList<Card>();
		peeksEachTableau.add(new Card());
		peeksEachTableau.add(new Card());
		peeksEachTableau.add(new Card());
		peeksEachTableau.add(new Card());
		peeksEachTableau.add(new Card());
		peeksEachTableau.add(new Card());
		peeksEachTableau.add(new Card());
		return peeksEachTableau;
	}

	public Object getDeckSize() {
		return 24;
	}

	public ArrayList<Integer> getSizeEachTableau() {
		ArrayList<Integer> sizeEachTableau = new ArrayList<Integer>();
		sizeEachTableau.add(1);
		sizeEachTableau.add(2);
		sizeEachTableau.add(3);
		sizeEachTableau.add(4);
		sizeEachTableau.add(5);
		sizeEachTableau.add(6);
		sizeEachTableau.add(7);
		return sizeEachTableau;
	}

}
