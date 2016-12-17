package uk.lakesidef0andjenny.openletter.cards;

import uk.lakesidef0andjenny.openletter.Player;

public class GuardCard extends Card {

	public GuardCard(){
		title = "Guard";
		level = 1;
		frequency = 5;
		abilityDesc = "Name a non-Guard card and choose another player.  If that player has that card, he or she is out of the round.";
	}
	
	@Override
	public void act(Player player) {
		// TODO Auto-generated method stub
		
	}
	
}
