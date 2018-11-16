/*
 * Fingal Lee
 * 16004718
 * 15-11-2018
 */

package pontoonMk3;

public enum Rank {
	
	ACE(1,"Ace"),
	TWO(2,"Two"),
	THREE(3,"Three"),
	FOUR(4,"Four"),
	FIVE(5,"Five"),
	SIX(6,"Six"),
	SEVEN(7,"Seven"),
	EIGHT(8,"Eight"),
	NINE(9,"Nine"),
	TEN(10,"Ten"),
	JACK(10,"Jack"),
	QUEEN(10,"Queen"),
	KING(10,"King");
	
	//private fields
	private final int rankValue;
	private final String rankString; 
	
	//constructor
	private Rank(int rankValue, String rankString)
	{
		this.rankValue = rankValue; 
		this.rankString = rankString; 
	}
	
	/**
	 * getRank()
	 * This method is responsible of returning the rank value
	 * @return rankValue
	 */
	public int getRank()
	{
		return rankValue;
	}
	
	/**
	 * printRank()
	 * This method is responsible for getting the string value assigned to a rank
	 * @return rankString
	 */
	public String printRank()
	{
		return rankString; 
	}
	
	
	

}
