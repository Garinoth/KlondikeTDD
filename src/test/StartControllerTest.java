package test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import main.Card;
import main.StartController;

import org.junit.Before;
import org.junit.Test;


public class StartControllerTest {
	
	StartController startController;
	
	@Before
	public void before() {
		startController = new StartController();
	}

	@Test
	public void isEmptyAllFoundationTest() {
		assertTrue(startController.isEmptyAllFoundation());
	}
	
	@Test
	public void peeksEachTableauTest() {
		ArrayList<Card> peeksEachTableau = startController.peeksEachTableau();
		ArrayList<Card> checkedCards = new ArrayList<Card>();
		for (Card card : peeksEachTableau) {
			assertTrue(card.isUpturned());
			assertFalse(checkedCards.contains(card));
			checkedCards.add(card);
		}
	}

}
