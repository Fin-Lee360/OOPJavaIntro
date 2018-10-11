package dotCom;

public class square {
	
	char symbol;
	boolean ship;
	
	//constructor
	square()
	{
		symbol = '~'; 
		ship = false; 
	}
	
	/**
	 * getSymbol()
	 * This method gets the symbol 
	 * @return symbol
	 */
	public char getSymbol()
	{
		return(symbol); 
	}
	
	/**
	 * getShip()
	 * This method gets ship (ship basically means *is ship present in square)
	 * @return ship
	 */
	public boolean getShip()
	{
		return(ship); 
	}
	
	/**
	 * setShip()
	 * This method sets the ship variable to true to indicate that there is a ship
	 * present in this square
	 * 
	 * @return ship
	 */
	public void setShip()
	{
		ship = true; 
	}
	
	/**
	 * setMiss()
	 * This method is responsible to setting the squares symbol when the player 
	 * misses
	 * 
	 * @return symbol
	 */
	public void setMiss()
	{
		symbol = 'M'; 
	}
	
	/**
	 * setMiss()
	 * This method is responsible to setting the squares symbol when the player 
	 * hits a square where a ship is present
	 * 
	 * @return symbol
	 */
	public void setHit()
	{
		symbol = 'H'; 
	}

}
