/*
 * Fingal Lee
 * 16004718
 * 15-11-2018
 */

package pontoonMk3;

import java.util.ArrayList;

public class Hand {
	
	protected ArrayList<Card> cards;
	
	//constructor 
	public Hand()
	{
		cards = new ArrayList<Card>(); 
	}
	
	/**
	 * clearCards()
	 * This method clears the cards from the hand
	 */
	public void clearCards()
	{
		cards.clear(); 
	}
	
	/**
	 * addCard()
	 * This methods adds a card to the hand
	 */
	public void addCard(Card card)
	{
		cards.add(card);
	}
	
	/**
	 * showHand()
	 * This method prints the card details of each card in the hand 
	 * @return handDetails
	 */
	public String showHand()
	{
		String handDetails = "";
		
		for(Card c:cards)
		{
			handDetails += c.cardDetails() + "\n"; 
		}
		
		return handDetails; 
	}
	
	/**
	 * giveCard()
	 * This method is responsible in giving a card to a hand
	 */
	public boolean giveCard(Card card, Hand otherHand)
	{
		if(!cards.contains(card))
		{
			// if card does not exist return false
			return false;
		}
		
		else 
		{
			// if card does exist, removes it, adds it to hand, returns true 
			cards.remove(card);
			otherHand.addCard(card);
			return true; 
		}
	}
	
	/**
	 * getTotal()
	 * This method calculates the total of a hand
	 * @return handTotal
	 */
	public int getTotal()
	{
		int handTotal = 0;
		boolean hasAce = false;
		
		//Get Total
		for(int i = 0; i < cards.size(); i++)
		{
			handTotal += cards.get(i).getRank(); 
			if(cards.get(i).getStringRank() == "Ace")
			{
				hasAce = true; 
			}
			if(hasAce && handTotal <= 11)
			{
				handTotal += 10; //adds 10 to ace to make 11
			}
		}
		
		return handTotal; 
	}
	
	

}
