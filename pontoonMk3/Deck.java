/*
 * Fingal Lee
 * 16004718
 * 15-11-2018
 */

package pontoonMk3;

import java.util.Random; 

public class Deck extends Hand{
	
	//creates random generator 
	Random rand = new Random(); 
	
	/**
	 * genDeck()
	 * This method populates the deck with cards
	 */
	public void genDeck()
	{
		for(Suit suit: Suit.values())
		{
			for(Rank rank: Rank.values())
			{
				Card card = new Card(rank,suit);
				this.addCard(card); 
			}
		}
	}// END genDeck()
	
	/**
	 * shuffleDeck()
	 * This method is responsible for shuffling the deck
	 */
	public void shuffleDeck()
	{
		for(int i = cards.size() - 1; i > 0; i--)
		{
			//swaps a random card between the beginning and the last card of deck 
			int random = rand.nextInt(i);
			Card randCard = cards.get(random);
			Card lastCard = cards.get(i); 
			cards.set(i, randCard);
			cards.set(random,lastCard);
		}
	}
	
	/**
	 * deal()
	 * This method is responsible with dealing the cards
	 */
	public void deal(Hand[] hands, int perHand)
	{
		for(int i = 0; i < perHand; i++)
		{
			for(int j = 0; j < hands.length; j++)
			{
				this.giveCard(cards.get(0), hands[j]); 
			}
		}
	}
	/**
	 * deal() - (override)
	 * This deals to a single hand
	 */
	public void deal(Hand hand, int perHand)
	{
		for(int i = 0; i < perHand; i++)
		{
			this.giveCard(cards.get(0), hand); 
		}
	}
	

}
