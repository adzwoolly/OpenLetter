package uk.lakesidef0andjenny.openletter.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uk.lakesidef0andjenny.openletter.cards.GuardCard;

public class GuardCardTests {

	GuardCard guard = new GuardCard();
	
	@Before
	public void setup(){
		
	}
	
	@Test
	public void testLevel() {
		assertEquals(1, guard.getLevel());
	}

}
