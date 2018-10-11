package dotCom;

public class ship {
	
	int row;
	int column;
	
	int [] rows = new int[3];
	int [] columns = new int [3]; 
	
	boolean horizontal; 
	boolean sunk; 
	
	//constructor
	ship()
	{
		sunk = false; 
	}
	
	/**
	 * genLocation()
	 * This method generates two arrays which make up the location of the ship.
	 * 
	 */
	public void genLocation()
	{
		getOrientation();
		row = (int) (Math.random() * 6);
		column = (int) (Math.random() * 6); 
		
		if( horizontal == true && column < 4)
		{
			for(int x = 0; x < 3; x++)
			{
				rows[x] = row;
				columns[x] = column; 
				column++;
				
			}
		}
		else if (horizontal == false && row < 4)
		{
			for(int x = 0; x < 3; x++)
			{
				rows[x] = row;
				columns[x] = column; 
				row++;
			}
		}
	}//END genLocation; 
	
	/**
	 * getRows()
	 * This method gets the generated rows
	 * @return rows[]
	 */
	public int[] getRows()
	{
		return rows; 
	}
	
	/**
	 * getColumns()
	 * This method gets the generated rows
	 * @return columns[]
	 */
	public int[] getColumns()
	{
		return columns; 
	}
	
	/**
	 * getOrientation
	 * Randomly generates an orientation (horizontal or not)
	 * @return horizontal
	 */
	public boolean getOrientation()
	{
		int rand = (int) (Math.random() * 2);
		
		if(rand == 0)
		{
			horizontal = false; 
		}
		else
		{
			horizontal = true; 
		}
		
		return(horizontal); 
	}
	

}
