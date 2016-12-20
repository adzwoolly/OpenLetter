package uk.lakesidef0andjenny.openletter.cards;

import uk.lakesidef0andjenny.openletter.Player;

public class PriestCard extends Card {

	public PriestCard(){
		title = "Priest";
		level = 2;
		frequency = 2;
		abilityDesc = "Look at another player's hand.";
	}
	
	@Override
	public void act(Player player) {
		System.out.println(player.getPlayerName() + " currently has " + player.getCurrentCard() + " in their hand.");
	}

}
