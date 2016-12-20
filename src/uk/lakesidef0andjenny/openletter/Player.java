package uk.lakesidef0andjenny.openletter;

import uk.lakesidef0andjenny.openletter.cards.*;

/**
 * 
 * Class responsible for containing player information
 * @author Lewis Blackburn
 * 
 */
public class Player {
	// player's name
	private String playerName;
	// the card the player currently has in their hand
	private Card currentCard;
	// if the player can be targeted by the effects of cards
	private boolean isProtected;
	// if the player is currently in the game
	private boolean isIn;
	// how many rounds the player has won
	private int score;

	/**
	 * constructor
	 */
	public Player(String playerName){
		this.playerName = playerName;
		currentCard = null;
		isProtected = false;
		isIn = true;
		score = 0;
	}

	/**
	 * accessor method for player's name
	 * @return playerName
	 */
	public String getPlayerName(){
		return playerName;
	}

	/**
	 * accessor method for player's current card
	 * @return currentCard
	 */
	public Card getCurrentCard(){
		return currentCard;
	}

	/**
	 * accessor method for if the player can be targeted
	 * @return isProtected
	 */
	public boolean isProtected(){
		return isProtected;
	}

	/**
	 * accessor method for amount of points
	 */
	public int getScore(){
		return score;
	}

	/**
	 * accessor method for if the player is in the game
	 */
	public boolean isIn(){
		return isIn;
	}
	
	/**
	 * changes if the player is in the game
	 */
	public void setIn(boolean isIn){
		this.isIn = isIn;
	}
	
	
	/**
	 * mutator to change if a player is protected
	 */
	public void setProtected(boolean isProtected){
		this.isProtected = isProtected;
	}
	
	/**
	 * String representation of player information
	 */
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Player name: ");
		sb.append(playerName);
		sb.append("\n");
		if (isProtected){
			sb.append("Cannot be targeted.");
			sb.append("\n");	
		}
		sb.append("Won ");
		sb.append(score);
		sb.append(" rounds.");
		return sb.toString();
	}
}
