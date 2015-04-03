package main;
import java.util.ArrayList;


public class StartController {

	public boolean isEmptyAllFoundation() {
		return true;
	}

	public boolean isEmptyWaste() {
		return true;
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
