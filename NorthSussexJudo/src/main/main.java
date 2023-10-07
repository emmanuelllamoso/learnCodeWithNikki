package main;

import java.io.IOException;
import java.util.Scanner;

public class main {
	
	public static void intro() {
		String plans[] = {
				" __________________________________________________________   ____________________________________________ ",
			    "|Training Plan - Prices($USD)                              | |Categories         | Upper Weight Limit(Kg) |",  
				"|----------------------------------------------------------| |--------------------------------------------|",
				"|Beginner (2 sessions per week) – weekly fee      | $25.00 | |Heavyweight        | Unlimited (over 100)   |",
				"|Intermediate (3 sessions per week) – weekly fee  | $30.00 | |Light-Heavyweight  | 100                    |",
				"|Elite (5 sessions per week) – weekly fee         | $35.00 | |Middleweight       | 90                     |",
				"|Private tuition – per hour                       | $9.00  | |Light-Middleweight | 81                     |",
				"|Competition entry fee – per competition          | $22.00 | |Lightweight        | 73                     |",
				"-----------------------------------------------------------* |Flyweight          | 66                     |",
				"                                                             *--------------------------------------------*"
		}; 
		
		for(int i =0;i<3;i++) 
			System.out.println((i==0) ? "*".repeat(110):"*"+" ".repeat(108) + "*");
		
		for(int i =0;i<plans.length;i++) {
			System.out.println("*" + plans[i] + " *");
		}
		System.out.println("*"+" ".repeat(108) + "*");
		System.out.println("*".repeat(110));
		System.out.println("*"+" ".repeat(108) + "*");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		intro(); 
		
		Athlete Nikki = new Athlete("Nikki", "Beginner", 48); 
		Athlete Pedro = new Athlete("Pedro", "Intermediate", 90); 
		Athlete Albert = new Athlete("Albert", "Elite", 81); 
		Athlete Bogart = new Athlete("Bogart", "Beginner", 100); 
		Athlete Monica = new Athlete("Monica", "Intermediate", 112); 
		Athlete Manny = new Athlete("Manny", "Elite", 75); 
		
		NothSussexJudoService North = new NothSussexJudoService();
		North.addAthlete(Nikki);
		North.addAthlete(Pedro);
		North.addAthlete(Albert);
		North.addAthlete(Bogart);
		North.addAthlete(Monica);
		North.addAthlete(Manny);
		
		North.addPrivateCoaching(Nikki, 1);
		// System.out.println(Manny.getNumPrivateCoaching());
		
		//itemised list of all costs for the month 
		System.out.println("* Enter the name of Athlete: ");
		North.showCost(sc.next());
		
		//Join competition
		North.joinCompetition(Monica);
		
		
		
	}

}
