
import java.io.*;
import java.util.Scanner;

public class Main {
	
	public static String[] getTeams() throws FileNotFoundException {			
		File f = new File("input.txt");
		Scanner sc1 = new Scanner(f);
		int size = 0;
		while (sc1.hasNextLine()){
			sc1.nextLine();
			++size;
		}
		String[] teams = new String[size];
		Scanner sc2= new Scanner(f);
		for (int i=0;i<size;++i) {
			teams[i] = sc2.nextLine();
		}
		sc1.close();
		sc2.close();
		return teams;
	}
	
	public static void main(String[] args) throws IOException {
		String[] teams= getTeams();
		FileWriter fw = new FileWriter("output.txt");		
		Rotator.scheduler(teams, fw);
		fw.close();
	}
}
