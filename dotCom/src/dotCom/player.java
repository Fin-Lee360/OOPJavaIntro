package dotCom;

import java.util.Scanner;

public class player {
	Scanner sc = new Scanner(System.in);
	
	int playerRow;
	int playerColumn;
	
	int score = 0;
	int shipsSunk = 0;
	int turns = 0; 
	
	/**
	 * getRow()
	 * This method is responsible for getting the row of choice the player would
	 * like to fire upon. Within this method the users choice is also converted
	 * into the correct format so that the multidimensional array can be accessed
	 * 
	 * @return playerRow
	 */
	public int getRow()
	{
		char row; 
		System.out.println("Please enter the row (along) on which you would like to fire");
		row = sc.next().charAt(0);
		
		switch (row){
		case 'A': playerRow = 0;
		break;
		case 'B': playerRow = 1;
		break;
		case 'C': playerRow = 2;
		break;
		case 'D': playerRow = 3;
		break;
		case 'E': playerRow = 4;
		break;
		case 'F': playerRow = 5;
		break;
		default: System.out.println("Row not recognised, try again"); 
		break; 
		}
		
		return(playerRow); 
	}
	
	/**
	 * This method is responsible for getting the column of choice the player would
	 * like to fire upon. Within this method the users choice is also converted
	 * into the correct format so that the multidimensional array can be accessed
	 * 
	 * @return playerColumn
	 */
	public int getColumn()
	{
		int column; 
		System.out.println("Please enter the column (down) on which you would like to fire");
		column = sc.nextInt();
		
		switch (column){
		case 1: playerColumn = 0;
		break;
		case 2: playerColumn = 1;
		break;
		case 3: playerColumn = 2;
		break;
		case 4: playerColumn = 3;
		break;
		case 5: playerColumn = 4;
		break;
		case 6: playerColumn = 5;
		break;
		default: System.out.println("Column not recognised, try again"); 
		break; 
		}
		
		return(playerColumn); 
	}
	
	/**
	 * scoreIncrese()
	 * this method is responsible for increasing the score every time there is a hit
	 */
	public void scoreIncrease()
	{
		score++;
	}
	
	/**
	 * getScore()
	 * This method returns the score
	 * 
	 * @return score
	 */
	public int getScore()
	{
		return(score);
	}
	
	/**
	 * calcSunk()
	 * This method is responsible for calculating the number of ships
	 * 
	 * @return shipsSunk
	 */
	public int calcSunk()
	{
		shipsSunk = score / 3;
		return(shipsSunk);
	}
	
	/**
	 * nextTurn()
	 * This method increases the number of turns by 1 after each shot has been taken
	 */
	public void nextTurn()
	{
		turns++; 
	}
	
	/**
	 * getTurns()
	 * This method returns the number of turns
	 * 
	 *  @return turns
	 */
	public int getTurn()
	{
		return(turns); 
	}
	

}
