package uk.lakesidef0andjenny.openletter.cards;

import uk.lakesidef0andjenny.openletter.Player;

public class PrinceCard extends Card {

	public PrinceCard(){
		title = "Prince";
		level = 5;
		frequency = 2;
		abilityDesc = "Choose any player (including yourself) to discard his or her hand and draw a new card.";
	}
	
	@Override
	public void act(Player player) {
		// TODO Auto-generated method stub

	}

}
