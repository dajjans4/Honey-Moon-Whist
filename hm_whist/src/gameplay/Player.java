package gameplay;

public class Player {

	private String name;
	private int wins;
	private int losses;
	private int tricksWon;
	
	Player(String playerName, int wins, int losses){
		this.name = playerName;
		this.wins = wins;
		this.losses = losses;
		this.tricksWon = 0;
	}
	
	public int getTricksWon(){
		return tricksWon;
	}
	
	public void setTricksWon(int tricks){
		this.tricksWon += tricks;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getWins(){
		return this.wins;
	}
	
	public void addWin(){
		this.wins++;
	}
	
	public int getLosses(){
		return this.losses;
	}
	
	public void addLoss(){
		this.losses++;
	}
}
