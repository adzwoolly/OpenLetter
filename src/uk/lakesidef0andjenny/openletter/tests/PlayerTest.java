package uk.lakesidef0andjenny.openletter.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uk.lakesidef0andjenny.openletter.Player;

public class PlayerTest {

	private Player player;
	
	@Before
	public void setup(){
		player = new Player("Test");
	}
	
	@Test
	public void testName() {
		assertEquals("Test", player.getPlayerName());
	}

}
