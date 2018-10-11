package dotCom;

public class grid {
	
	public square grid[][] = new square[6][6];
	ship ship = new ship();
	player player1 = new player(); 
	
	void gridInitilise()
	{
		genGrid();
		genShips();
		printGrid();
	}
	
	/**
	 * genGrid()
	 * This method is responsible for creating the grid out of square objects
	 */
	public void genGrid()
	{
		for(int x = 0; x < 6; x++)
		{
			for(int y = 0; y < 6; y++)
			{
				grid[x][y] = new square(); 
			}
		}
	}//END genGrid()
	
	/**
	 * printGrid()
	 * This method is responsible for printing the grid
	 */
	public void printGrid()
	{
		int row = 1; 
		System.out.println("  A  B  C  D  E  F   Score > " + player1.getScore()+ " ships sunk > " + player1.calcSunk());
		for(int x = 0; x < 6; x++)
		{
			System.out.print(row + " "); 
			for(int y =0; y < 6; y++)
			{
				System.out.print(grid[x][y].getSymbol() + "  ");
			}
			System.out.println("");
			row++; 
		}
				
	}//END printGrid()
	
	/**
	 * genShips()
	 * This method generates 3 ships and places them onto the grid
	 * 
	 */
	public void genShips()
	{
		int [] row;
		int [] column;
		int shipCount = 0;
		int spaces = 0;
		
		while(shipCount < 3)
		{
			ship.genLocation();
			row = ship.getRows();
			column = ship.getColumns();
			
			spaces = 0;
			
			 
			
			// for loop that checks each square to make sure there is no ship
			for(int x = 0; x < 3; x++)
			{
				if(grid[column[x]][row[x]].getShip() == false)
				{
					
					spaces++; 
				}
			}
			// if there are enough spaces then the ships are placed
			if(spaces == 3)
			{
				for(int x = 0; x < 3; x++)
				{
					//commented code for debugging
					//System.out.println("Row > " + row[x] + "  Column > " + column[x]);
					grid[column[x]][row[x]].setShip(); 
					//grid[column[x]][row[x]].setMiss();
				}
				shipCount++; 
				
				// if to try and deal with the weird glitch, check read me
				if((column[0]+row[0]) == (column[1]+row[1]))
				{
					shipCount--; 
				}
				
			}
			

		}
	}//END genShips()
		
	
	/**
	 * checkFire()
	 * This method is responsible for calling the methods which get the firing 
	 * coordinates and then checks the square which has been fired upon to see
	 * if it was a hit or miss
	 */
	public void checkFire()
	{
		int row = player1.getRow();
		int column = player1.getColumn();
		
		if(grid[column][row].getShip() == true)
		{
			grid[column][row].setHit();
			player1.scoreIncrease();
		}
		else
		{
			grid[column][row].setMiss();
		}
		
		printGrid(); 
		
	}//END checkFire()
	
	

}
