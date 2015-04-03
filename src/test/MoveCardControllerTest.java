package test;
import main.MoveCardController;

import org.junit.Before;
import org.junit.Test;


public class MoveCardControllerTest {
	
	private MoveCardController moveCardController;
	
	@Before
	public void before() {
		moveCardController = new MoveCardController();
	}

	@Test
	public void MoveFromDeckToWasteTest() {
		MoveCardController moveCardController1 = new MoveCardController(24,0);
		MoveCardController moveCardController2 = new MoveCardController(3,0);
		MoveCardController moveCardController3 = new MoveCardController(2,0);
		MoveCardController moveCardController4 = new MoveCardController(1,0);
		MoveCardController moveCardController5 = new MoveCardController(0,0);
		
		int initialDeckSize1 = moveCardController1.getDeckSize();
		moveCardController1.moveFromDeckToWaste();
		assertTrue();
	}

}
