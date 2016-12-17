package uk.lakesidef0andjenny.openletter.cards;

import uk.lakesidef0andjenny.openletter.Player;

public class BaronCard extends Card {

	public BaronCard(){
		title = "Baron";
		level = 3;
		frequency = 2;
		abilityDesc = "You and another player secretly compare hands.  The player with the lower value is out of the round.";
	}
	
	@Override
	public void act(Player player) {
		// TODO Auto-generated method stub

	}

}
