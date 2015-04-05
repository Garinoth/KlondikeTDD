package test;
import static org.junit.Assert.assertTrue;
import main.Card;
import main.Foundation;
import main.MoveCardController;
import main.Suits;

import org.junit.Test;


public class MoveCardControllerTest {

	@Test
	public void MoveFromDeckToWasteTest() {
		MoveCardController moveCardController1 = new MoveCardController(24);
		MoveCardController moveCardController2 = new MoveCardController(3);
		MoveCardController moveCardController3 = new MoveCardController(2);
		MoveCardController moveCardController4 = new MoveCardController(1);
		MoveCardController moveCardController5 = new MoveCardController(0);
		MoveCardController moveCardController6 = new MoveCardController(4);
		
		moveCardController1.moveFromDeckToWaste();
		assertTrue(moveCardController1.getDeckSize() == 21);
		assertTrue(moveCardController1.getWasteSize() == 3);
		
		moveCardController2.moveFromDeckToWaste();
		assertTrue(moveCardController2.getDeckSize() == 0);
		assertTrue(moveCardController2.getWasteSize() == 3);
		
		moveCardController3.moveFromDeckToWaste();
		assertTrue(moveCardController3.getDeckSize() == 0);
		assertTrue(moveCardController3.getWasteSize() == 2);
		
		moveCardController4.moveFromDeckToWaste();
		assertTrue(moveCardController4.getDeckSize() == 0);
		assertTrue(moveCardController4.getWasteSize() == 1);
		
		moveCardController5.moveFromDeckToWaste();
		assertTrue(moveCardController5.getDeckSize() == 0);
		assertTrue(moveCardController5.getWasteSize() == 0);
		
		moveCardController6.moveFromDeckToWaste();
		assertTrue(moveCardController6.getDeckSize() == 1);
		assertTrue(moveCardController6.getWasteSize() == 3);
	}
	
	@Test
	public void MoveFromWasteToFoundationTest() {
		// TODO: waste -1 foundation +1
		// check suit
		// check order
		MoveCardController moveCardController = new MoveCardController(24);
		Foundation foundation = new Foundation(Suits.SPADES);
		moveCardController.getWaste().addCard(new Card(5, Suits.SPADES));
		moveCardController.moveFromWasteToFoundation(foundation);
	}
	
	@Test
	public void MoveFromWasteToTableauTest() {
		
	}
}
