package main;

import java.util.ArrayList;
import java.util.List;

public class NothSussexJudoService {
	private List<Athlete> listAthlete;
	
	
	public NothSussexJudoService() {
		listAthlete = new ArrayList<Athlete>(); 
	} 
	public void addAthlete(Athlete name) {
		int weight = name.getWeight(); 
		
		if(weight<=66)
			name.setWeightCategory("Flyweight");
		else if(weight<=73) 
			name.setWeightCategory("Lightweight");
		else if(weight<=81) 
			name.setWeightCategory("Light-Middleweight");
		else if(weight<=90) 
			name.setWeightCategory("Middleweight");
		else if(weight<=100)
			name.setWeightCategory("Light-Heavyweight");
		else
			name.setWeightCategory("Heavyweight");
		listAthlete.add(name);	
	}
	public void addPrivateCoaching(Athlete name, int numberOfHours) {
		int sum = name.getNumPrivateCoaching() + numberOfHours; 
		
		if(sum<=5)
			name.setNumPrivateCoaching(sum);
		else {
			System.out.println("Maximum of 5 hours private coaching allowed per week");
		}
	}
	public int costOfPlan(String plan) {
		if(plan.equals("beginner"))
			return 25; 
		else if(plan.equals("intermediate"))
			return 30;
		else if(plan.equals("elite"))
			return 35;
		return 0;
	}
	public void showCost(String name) {
		Athlete athlete = null; 
		String plan =""; 
		int competition =0;
		int privateTutor = 0; 
		
		for(Athlete n: listAthlete) {
			if(n.getName().equals(name)) {
				athlete =n;
				plan = athlete.getPlan().toLowerCase();
				privateTutor = athlete.getNumPrivateCoaching();
				competition = athlete.getNumCompetitions(); 
				break; 
			}
		}
		
		System.out.println("* Plan: "+plan + ": $"+costOfPlan(plan));
		System.out.println("* Private tuition: $"+privateTutor*9);
		System.out.println("* Number of Competition is "+ competition + ": $"+competition*22 );
	}
	public void joinCompetition(Athlete athlete) {
		if(athlete.getPlan().toLowerCase().equals("intermediate") || athlete.getPlan().toLowerCase().equals("elite")) {
			athlete.setNumCompetitions(athlete.getNumCompetitions()+1);
			System.out.println("Successfully joined a Competition");
		}
		else 
			System.out.println("Only the Elite and Intermediate plan can join");
	}
}
