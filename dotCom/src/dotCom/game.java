package dotCom;

public class game {
	
	public static grid playerGrid = new grid();

	public static void main(String[] args) {
		
		//initalises grid with ships
		playerGrid.gridInitilise();
		
		//loop that continues program until all 3 ships have been sunk
		while(playerGrid.player1.calcSunk() < 3)
		{
			playerGrid.checkFire();
			playerGrid.player1.nextTurn();  
		}
		
		System.out.println("You have sunk all 3 ships in, " + playerGrid.player1.getTurn() + " Turns");
	}

}
