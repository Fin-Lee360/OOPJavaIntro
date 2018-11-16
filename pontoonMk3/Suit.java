/*
 * Fingal Lee
 * 16004718
 * 15-11-2018
 */

package pontoonMk3;

public enum Suit {
	
	HEARTS("Hearts"),
	DIAMONDS("Diamonds"),
	SPADES("Spades"),
	CLUBS("Clubs");
	
	private final String suitText;
	
	//Constructor Method
	private Suit(String suitText)
	{
		this.suitText = suitText;
	}
	
	/**
	 * getSuit()
	 * This method is responsible of getting the suits text
	 * @return suitText
	 */
	public String getSuit()
	{
		return suitText; 
	}

}
