package uk.lakesidef0andjenny.openletter.cards;

import uk.lakesidef0andjenny.openletter.Player;

/**
 * Abstract class representing cards player plays
 * @author Adam Woollen
 * @author Lewis Blackburn
 * @author Thavi Tennakoon
 * @author Jennifer Myers
 * @version 1.0
 */

public abstract class Card {
	// Title of card
	private String title;
	// Power level of card- the higher the value, the stronger the card
	private int level;
	// How many times the card appears in the deck of cards
	private int frequency;
	// Description of ability
	private String abilityDesc;
	
	/**
	 * Method called when a card is discarded / used
	 * @param player the player that used this card
	 */
	public abstract void act(Player player);
	
	/**
	 *  Accessor method for the level of the card
	 * @return the level representing how close this card is to the princess
	 */
	public final int getLevel(){
		return level;
	}
	
	/**
	 * Checks if the card is equal to a specified card
	 * @return true if the two cards are the same
	 */
	public boolean equalsCard(){
		return true;
	}
	
	/**
	 * Accessor method for the description of what the card does when discarded / used
	 * @return the description of this card's ability
	 */
	public final String getAbilityDesc(){
		return abilityDesc;
	}
}
