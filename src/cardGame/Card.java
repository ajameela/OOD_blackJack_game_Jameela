/*
 * Name: Jameela Ahmed
 * Date: 09/24/2026
 * Program: Blackjack Card Game
 * Creates Card objects and uses them in a simple card game.
 */

package cardGame;

import java.util.Objects;

public class Card {
	
	private String cardSuit;
	private String cardName;
	private int cardValue;
	private String cardPicture;
	
	public Card(String cardSuit, String cardName, int cardValue, String cardPicture) {
		
		this.cardSuit = cardSuit;
		this.cardName = cardName;
		this.cardValue = cardValue;
		this.cardPicture = cardPicture;
	}

	public String getCardSuit() {
		return cardSuit;
	}

	public void setCardSuit(String cardSuit) {
		this.cardSuit = cardSuit;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public int getCardValue() {
		return cardValue;
	}

	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}

	public String getCardPicture() {
		return cardPicture;
	}

	public void setCardPicture(String cardPicture) {
		this.cardPicture = cardPicture;
	}

	
	@Override
	public String toString() {
		return "Card [cardSuit=" + cardSuit + ", cardName=" + cardName + ", cardValue=" + cardValue + ", cardPicture="
				+ cardPicture + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return Objects.equals(cardName, other.cardName) && cardValue == other.cardValue;
		//only compares cardNames and cardValues; example - if values equal each other - returns true
	}

}//End Card Class
