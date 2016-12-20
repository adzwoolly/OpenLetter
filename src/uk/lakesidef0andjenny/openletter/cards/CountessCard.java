package uk.lakesidef0andjenny.openletter.cards;

import uk.lakesidef0andjenny.openletter.Player;

public class CountessCard extends Card {

	public CountessCard(){
		title = "Countess";
		level = 7;
		frequency = 1;
		abilityDesc = "If you have this card and the King or Price in your hand, you must discard this card.";
	}
	
	@Override
	public void act(Player player) {
		// does nothing as the check if the player has the king or the prince is done in act method
	}

}
