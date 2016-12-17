package uk.lakesidef0andjenny.openletter.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uk.lakesidef0andjenny.openletter.Player;
import uk.lakesidef0andjenny.openletter.cards.Card;

public class CardTests {

	private TestCard card;
	
	@Before
	public void setup(){
		card = new TestCard();
	}
	
	@Test
	public void testGetLevel() {
		assertEquals(9, card.getLevel());
	}

	@Test
	public void testGetAbilityDesc() {
		String properAbilityDesc = "nuke the entire city so the princess is not sad because she is dead.";
		assertEquals(properAbilityDesc, card.getAbilityDesc());
	}

	
	private class TestCard extends Card{

		public TestCard(){
			title = "Test Character";
			level = 9;
			frequency = 1;
			abilityDesc = "nuke the entire city so the princess is not sad because she is dead.";
		}
		
		@Override
		public void act(Player player) {
			// Not implemented as we don't want to test this here
		}
		
	}
	
}
