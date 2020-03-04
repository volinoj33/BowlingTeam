//BowlingTeamDemo application
//James Volino
//Chapter 8: pg.386-391

import java.util.*;
public class BowlingLeague
{
	public static void main(String[] args)
	{
		//Variables and Constants
		String name;
		int x;
		int y;
		final int NUM_TEAM_MEMBERS = 4;
		final int NUM_TEAMS = 4;
		BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
		
		//Objects
		Scanner input = new Scanner(System.in);

		//Input Phase
		//Loop which deals with teams array
		for(y=0; y < NUM_TEAMS; ++y)
		{
			teams[y] = new BowlingTeam();
			
			System.out.print("Enter team name >> ");
				name = input.nextLine();
			teams[y].setTeamName(name);
			
			//Loop to ask user 4 times per team
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			{
				System.out.print("Enter Team Member's Name >> ");
					name = input.nextLine();
				teams[y].setMember(x,name);
			}
		}
		//Output phase
		for(y = 0; y < NUM_TEAMS; ++y)
		{
			System.out.println("\nMembers of team " + teams[y].getTeamName() + ": ");
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			{
				System.out.print(teams[y].getMember(x) + "\n");
			}
			System.out.println();
		}
		System.out.print("\nEnter a team name to see its roster >> ");
			name = input.nextLine();
		
		//Loop through the teams array to see if there is a match
		for(y = 0; y < NUM_TEAMS; ++y)
		{
			if(name.equalsIgnoreCase(teams[y].getTeamName()))
			{
				for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
				{
					System.out.print(teams[y].getMember(x) + "\n");
				}
				System.out.println();
			}
		}
	}
}