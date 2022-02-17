package classSamples.polymorphism.SearchingAndSorting;

public class Sports implements Comparable<Sports> {
	private final String name;
	private final String players;
	
	// create constructor initializing name, players
	
	public Sports ( String name, String players) {
		
		this.name = name;
		this.players = players;
		
	}
	// create getter methods for name and players
	public String getName() {
		
	}
	public int getPlayers() {
	}
		
	
	
	//create a toString method
	
	public String toString() {
		return  players + "," + name;
	
	}
	//override equals method
	public boolean equals(Object other) {
		return ( )
	}
	
	
	//finish overriding compareTo

	@Override
	public int compareTo(Sports o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
