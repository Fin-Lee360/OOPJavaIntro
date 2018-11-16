/*
 * Fingal Lee
 * 16004718
 * 15-11-2018
 */

package pontoonMk3;

import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in);
	
	Hand player = new Hand();
	Hand dealer = new Hand();
	Deck d1 = new Deck();
	Hand[] hands = {player,dealer};
	
	//constructor
	public Game()
	{
		startGame();
	}

	/**
	 * createDeck()
	 * This method acts as a director to create the deck, shuffle it and deal the 
	 * first two cards
	 */
	public void startGame()
	{
		d1.genDeck();
		d1.shuffleDeck(); 
		d1.deal(hands, 2);
	}
	
	/**
	 * printHand()
	 * This method prints the players hand
	 */
	public void printHand()
	{
		System.out.print("You have :" + "\n" + player.showHand());
		System.out.println("For a total of: " + player.getTotal());
	}
	
	/**
	 * dealPlayer()
	 * This method deals another card to the player
	 */
	public void dealPlayer()
	{
		d1.deal(player,1);
	}
	
	/**
	 * playerChoice()
	 * This method gets the players choice to stick or twist
	 */
	public int playerChoice()
	{
		int choice = 0;
		
		System.out.println("Would you like to stick or twist?");
		System.out.println("1 > stick (Hold)");
		System.out.println("2 > twist (Another card)");
		choice = sc.nextInt(); 
		
		return choice;
	}
	
	/**
	 * calcWinner()
	 * This method is used to calculate who is the winner
	 */
	public void calcWinner()
	{
		int playerScore = player.getTotal() - 21;
		int dealerScore = dealer.getTotal() - 21;
		
		if(playerScore > dealerScore && playerScore <= 0)
		{
			System.out.println("Congratulations, You Win!");
		}
		else
		{
			System.out.println("Sorry, Dealer Wins..");
		}
	}
	
}
