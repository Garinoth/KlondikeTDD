package main;
import java.util.ArrayList;


public class StartController {

	public boolean isEmptyAllFoundation() {
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

	public boolean isEmptyWaste() {
		return true;
	}

}
