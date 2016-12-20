package uk.lakesidef0andjenny.openletter.cards;

import uk.lakesidef0andjenny.openletter.Player;

public class PrincessCard extends Card {

	public PrincessCard(){
		title = "Princess";
		level = 8;
		frequency = 1;
		abilityDesc = "If you discard this card, you are out of the game.";
	}
	
	@Override
	public void act(Player player) {
		player.setIn(false);
	}

}
