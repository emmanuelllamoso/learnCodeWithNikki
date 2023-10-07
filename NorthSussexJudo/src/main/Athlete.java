package main;

public class Athlete {

	private String name; 
	private String plan; 
	private int weight; 
	private String weightCategory; 
	private int numCompetitions; 
	private int numPrivateCoaching; 
	
	public Athlete() {
		super();
	}
	
	public Athlete(String name, String plan, int weight) {
		super();
		this.name = name;
		this.plan = plan;
		this.weight = weight;
	}

	public Athlete(String name, String plan, int weight, int numCompetitions) {
		super();
		this.name = name;
		this.plan = plan;
		this.weight = weight;
		this.numCompetitions = numCompetitions;
	}

	public Athlete(String name, String plan, int weight, String weightCategory, int numCompetitions) {
		super();
		this.name = name;
		this.plan = plan;
		this.weight = weight;
		this.weightCategory = weightCategory;
		this.numCompetitions = numCompetitions;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getWeightCategory() {
		return weightCategory;
	}

	public void setWeightCategory(String weightCategory) {
		this.weightCategory = weightCategory;
	}

	public int getNumCompetitions() {
		return numCompetitions;
	}

	public void setNumCompetitions(int numCompetitions) {
		this.numCompetitions = numCompetitions;
	}

	public int getNumPrivateCoaching() {
		return numPrivateCoaching;
	}
	public void setNumPrivateCoaching(int numPrivateCoaching) {
		this.numPrivateCoaching = numPrivateCoaching;
	}
	
}
