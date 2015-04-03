package main;
import java.util.ArrayList;


public class StartController {

	private ArrayList<ArrayList<Card>> foundations;
	private ArrayList<Card> waste;
	
	public StartController() {
		this.foundations = new ArrayList<ArrayList<Card>>();
		this.foundations.add(new ArrayList<Card>());
		this.foundations.add(new ArrayList<Card>());
		this.foundations.add(new ArrayList<Card>());
		this.foundations.add(new ArrayList<Card>());
		
		this.waste = new ArrayList<Card>();
	}
	
	public boolean isEmptyAllFoundation() {
		boolean result = true;
		for (ArrayList<Card> foundation : this.getFoundations()) {
			result = result && foundation.isEmpty();
		}
		return result;
	}

	private ArrayList<ArrayList<Card>> getFoundations() {
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
