package uk.lakesidef0andjenny.openletter.cards;

import uk.lakesidef0andjenny.openletter.Player;

public class KingCard extends Card {

	public KingCard(){
		title = "King";
		level = 6;
		frequency = 1;
		abilityDesc = "Trade hands with another player of your choice.";
	}
	
	@Override
	public void act(Player player) {
		// TODO Auto-generated method stub

	}

}
