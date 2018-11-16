/*
 * Fingal Lee
 * 16004718
 * 15-11-2018
 */

package pontoonMk3;

public class Card {
	
	private Suit suit;
	private Rank rank;
	
	//constructor
	public Card(Rank rank, Suit suit)
	{
		this.rank = rank;
		this.suit = suit; 
	}
	
	/**
	 * getSuit()
	 * This method gets suit value
	 * @return suit
	 */
	public String getSuit()
	{
		return suit.getSuit(); 
	}
	
	/**
	 * getRank()
	 * This method gets rank value
	 * @return rank
	 */
	public int getRank()
	{
		return rank.getRank(); 
	}
	
	/**
	 * getStringRank
	 * This method gets the string assigned to the cards rank
	 * @return stringRank
	 */
	public String getStringRank()
	{
		return rank.printRank(); 
	}
	
	/**
	 * cardDetails()
	 * This method creates the cards details using the suit and rank
	 * @param suit, rank
	 * @return cardDetails
	 */
	public String cardDetails()
	{
		String cardDetails = "";
		
		cardDetails += rank.printRank() + " of " + suit.getSuit(); 
		
		return cardDetails; 
	}
	

}
