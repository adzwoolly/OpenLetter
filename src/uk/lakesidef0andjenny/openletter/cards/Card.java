package uk.lakesidef0andjenny.openletter.cards;

/**
 * abstract class representing cards player plays
 * @author Adam Woollen
 * @author Lewis Blackburn
 * @version 
 */

public abstract class Card {
	// title of card
	private String title;
	// power level of card- the higher the value, the stronger the card
	private int level;
	// what the card does when it is played
	private Ability ability;
	// how many times the card appears in the deck of cards
	private int frequency;
	
	// method called when a card is discarded
	public void act(player);
	// accessor method for the level of the card
	public int getLevel(){
		return level;
	}
	// checks if the card is equal to a specified card
	public boolean equalsCard(){
		return true;
	}
}
