/*
 * Fingal Lee 
 * 16004718
 * 27-09-2018
 * 
 */

package pontoon;
import java.util.Scanner;


public class game {
	
	Scanner sc = new Scanner(System.in);
	
	String[] suits = {"Hearts","Diamonds","Spades","Clubs"};
	int[] ranks = {2,3,4,5,6,7,8,9};
	card deck[] = new card[32];
	
	int random;
	int total; 
	int choice = 0;
	int gameChoice = 0; 
	
	
	public static void main(String [] args)
	{
		game direct = new game();
		direct.director(); 
	}
	
	public void director()
	{
		genDeck();
		
		while(gameChoice != 3)
		{
			drawCard();
			drawCard();
			
			while(choice != 3)
			{
				getChoice(); 
				if(choice == 1){break;}
				
				else if (choice == 2){drawCard();}
				
				if (total > 21){break;}
			}
			
			playerOutcome();
			getGameChoice();
			
			if(gameChoice == 1){resetGame();}
			else if(gameChoice == 2){break;};
		}
		
		System.out.println("Exiting");
	}
	
	
	/**
	 * genDeck()
	 * This method generates a deck of cards
	 */
	public void genDeck()
	{
		int z = 0;
		
		while(z < 32)
		{
			for(int x = 0; x < suits.length; x++)
			{
				for(int y = 0; y < ranks.length; y++)
				{
				deck[z] = new card(suits[x],ranks[y],false);
				z++;
				}
			}
		}
	}//END genDeck(); 
	
	/**
	 * drawCard()
	 * This method draws a card and displays its details and adds its rank to the total,
	 * if a card has already been chosen then it will re run the method until it finds a
	 * card that hasn't 
	 */
	public void drawCard()
	{
		random = (int) (Math.random() * 32); 
		
		if(deck[random].returnCard() == false)
		{
			deck[random].setCard();
			total = total + deck[random].returnCardRank(); 
			deck[random].displayCard(); 
		}
		else
		{
			drawCard(); 
		}
	}// END drawCard
	
	/**
	 * resetGame()
	 * This method is responsible for resetting a game 
	 */
	public void resetGame()
	{
		total = 0; 
		for(int x = 0; x < 32; x++)
		{
			deck[x].resetCard(); 
		}
	}// END resetCard()
	
	/**
	 * playerOutcome()
	 * 
	 */
	public void playerOutcome()
	{
		if(total >= 18 && total <= 21)
		{
			System.out.println("Total > " + total);
			System.out.println("You WIN !!");
		}
		else
		{
			System.out.println("Total > " + total);
			System.out.println("You loose...");
		}
	}//END playerOutcome() 
	
	
	/**
	 * getChoice
	 * This method is responsible for getting the players choice
	 */
	public int getChoice()
	{
		System.out.println("Your current cards have a value of > "+ total);
		System.out.println("Would you like to stick or twist");
		System.out.println("1 > Stick (hold)");
		System.out.println("2 > Twist (get another card)");
		choice = sc.nextInt(); 
		
		return choice; 
		
	}//END getChoice()
	
	/**
	 * getGameChoice
	 * This method is responsible for getting the players choice
	 */
	public int getGameChoice()
	{
		System.out.println("would You like to play again?");
		System.out.println("1 > Play again");
		System.out.println("2 > Exit");
		gameChoice = sc.nextInt(); 
		
		return gameChoice; 
		
	}//END getChoice()
	
	

	

}
