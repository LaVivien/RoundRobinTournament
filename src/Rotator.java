import java.io.*; 

public class Rotator {
	
	public static void scheduler(String[] teams, FileWriter fw)  throws IOException  {  
		int numOfTeams = teams.length;
		String[] evenTeams;
		int k = 0; 
		if (numOfTeams % 2 == 0) {
			evenTeams = new String[numOfTeams-1];
			for(k = 0; k < numOfTeams-1; k++)
				evenTeams[k] = teams[k+1];	        
	    } else {
	    	evenTeams = new String[numOfTeams];
	    	for(k = 0;k < numOfTeams-1; k++)
				evenTeams[k] = teams[k+1];
	    	evenTeams[numOfTeams-1] = "Bye"; 
	    }
		int teamsSize = evenTeams.length; //it is even number			
	    int total = ((teamsSize+1) - 1); // rounds needed to complete tournament
	    int halfSize = (teamsSize+1)/ 2; 
	    int count = 0;
	    for (int week = total-1; week >= 0; week--)  {
	        System.out.println("week " + (++count));
	        fw.write("\r\nweek " + (count) +"\r\n");
	        int teamIdx = week % teamsSize;
	        if(!evenTeams[teamIdx].equals("Bye")) {
	        	System.out.println(teams[0] + " vs. "+ evenTeams[teamIdx] );
	        	fw.write(teams[0] + " vs. "+ evenTeams[teamIdx] +"\r\n");
	        }
	        for (int i = 1; i < halfSize; i++) {               
	            int firstTeam = (week + i) % teamsSize;
	            int secondTeam = (week  + teamsSize - i) % teamsSize;
	            if ( !evenTeams[firstTeam].equals("Bye") && !evenTeams[secondTeam].equals("Bye")) {
	            	System.out.println(evenTeams[firstTeam] + " vs. "+ evenTeams[secondTeam]);
	            	fw.write(evenTeams[firstTeam] + " vs. "+ evenTeams[secondTeam] +"\r\n");
	            }	            	
	        }
	        System.out.println();
	    }
	}
}
