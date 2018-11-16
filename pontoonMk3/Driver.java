/*
 * Fingal Lee
 * 16004718
 * 15-11-2018
 */

package pontoonMk3;

public class Driver {

	public static void main(String[] args) {
		
		Game game = new Game();
		
		while(game.player.getTotal() < 21)
		{
			int choice = 0;
			
			game.printHand();
			choice = game.playerChoice();
			
			if(choice == 1)
			{
				break;
			}
			else if(choice == 2)
			{
				game.dealPlayer(); 
			}
		}
		System.out.println("Your total is: " + game.player.getTotal());
		System.out.println("Dealer total is: " + game.dealer.getTotal());
		
		game.calcWinner();

	}

}
