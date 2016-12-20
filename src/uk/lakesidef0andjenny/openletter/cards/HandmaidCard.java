package uk.lakesidef0andjenny.openletter.cards;

import uk.lakesidef0andjenny.openletter.Player;

public class HandmaidCard extends Card {

	public HandmaidCard(){
		title = "Handmaid";
		level = 3;
		frequency = 2;
		abilityDesc = "Until your next turn, ignore all effects from other players' cards.";
	}
	
	@Override
	public void act(Player player) {
		player.setProtected(true);
	}

}
