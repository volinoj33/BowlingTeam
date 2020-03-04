//BowlingTeamDemo application
//James Volino
//Chapter 8: pg.386-391

import java.util.*;
public class BowlingTeamDemo
{
	public static void main(String[] args)
	{
		//Variables and Constants
		String name;
		int x;
		final int NUM_TEAM_MEMBERS = 4;
		
		
		//Objects
		Scanner input = new Scanner(System.in);
		BowlingTeam bowlTeam = new BowlingTeam();

		//Input Phase
		System.out.print("Enter team name >> ");
			name = input.nextLine();
		bowlTeam.setTeamName(name);
		
		//Loop to ask user 4 times per team
		for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
		{
			System.out.print("Enter Team Member's Name >> ");
				name = input.nextLine();
			bowlTeam.setMember(x,name);
		}
	
		//Output phase
		System.out.println("\nMembers of team " + bowlTeam.getTeamName() + ": ");
		for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
		{
			System.out.print(bowlTeam.getMember(x) + "\n");
		}
		System.out.println();
	}
}