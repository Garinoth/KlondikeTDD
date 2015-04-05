package test;
import static org.junit.Assert.assertTrue;
import main.MoveCardController;

import org.junit.Before;
import org.junit.Test;


public class MoveCardControllerTest {

	@Test
	public void MoveFromDeckToWasteTest() {
		MoveCardController moveCardController1 = new MoveCardController(24,0);
		MoveCardController moveCardController2 = new MoveCardController(3,0);
		MoveCardController moveCardController3 = new MoveCardController(2,0);
		MoveCardController moveCardController4 = new MoveCardController(1,0);
		MoveCardController moveCardController5 = new MoveCardController(0,0);
		
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
	}

}
