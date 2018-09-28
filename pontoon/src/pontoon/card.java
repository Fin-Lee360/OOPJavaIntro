/*
 * Fingal Lee 
 * 16004718
 * 27-09-2018
 * 
 */


package pontoon;

public class card {
	
	private String suit;
	private int rank;
	private boolean drawn; 
	
	public card(String suits, int ranks, boolean b)
	{
		suit = suits;
		rank = ranks;
		drawn = b; 
	}
	
	/**
	 * displayCard()
	 * This method is responsable for displaying the cards details
	 */
	public void displayCard()
	{
		System.out.println("you have a "+rank+" of "+suit);
	}
	
	/**
	 * returnCard()
	 * This method returns the value of the drawn boolean, if false, card not drawn,
	 * if true then card drawn
	 */
	public boolean returnCard()
	{
		return(drawn);
	}
	
	/**
	 * returnCardRank()
	 * This method returns the value of the card so that it can be added to the total
	 */
	public int returnCardRank()
	{
		return(rank);
	}
	
	/**
	 * setCard()
	 * This method sets the drawn card to true, this is called when a card is drawn
	 */
	public void setCard()
	{
		drawn = true; 
	}
	
	/**
	 * resetCard()
	 * This method resets the cards back to false when the game is reset
	 */
	public void resetCard()
	{
		drawn = false; 
	}
	

}
