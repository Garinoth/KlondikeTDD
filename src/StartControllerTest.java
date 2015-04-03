import static org.junit.Assert.*;

import java.util.ArrayList;

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
		
	}

}
