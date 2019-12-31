// *********************************************************
// Player.java
//
// Defines a Player class that holds information about an athlete.
// **********************************************************
import java.util.Scanner;

public class Player {

	private String name;
	private String team;
	private int jerseyNumber;

	// -----------------------------------------------------------
	// Prompts for and reads in the player's name, team, and
	// jersey number.
	// -----------------------------------------------------------
	public void readPlayer() {

		Scanner scan = new Scanner(System.in);
		System.out.print("Name: ");
		name = scan.nextLine();
		System.out.print("Team: ");
		team = scan.nextLine();
		System.out.print("Jersey number: ");
		jerseyNumber = scan.nextInt();
	}

	public boolean equals2(Player player2) {
		if ((team.equals(player2.team))
				&& (jerseyNumber == player2.jerseyNumber))
			return true;
		else
			return false;
	}
		
		public boolean equals(Object player2) {
			if ((team.equals( ((Player)player2).team)) 
					&& (jerseyNumber == ((Player)player2).jerseyNumber))
				return true;
			else
				return false;
	}
}