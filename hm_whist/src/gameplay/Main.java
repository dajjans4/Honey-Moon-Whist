package gameplay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		Player play1;
		Player play2;
		System.out.print("Enter the name of the first player: ");
		try{
			BufferedReader play1name = new BufferedReader(new InputStreamReader(System.in));
			play1 = new Player(play1name.readLine(),0,0);
		}catch(IOException e){
			e.printStackTrace();
			play1 = new Player("no name", 0, 0);
		}
		System.out.print("Enter the name of the second player: ");
		try{
			BufferedReader play2name = new BufferedReader(new InputStreamReader(System.in));
			play2 = new Player(play2name.readLine(),0,0);
		}catch(IOException e){
			e.printStackTrace();
			play2 = new Player("no name", 0, 0);
		}

		System.out.print("SPADES: how many tricks did " + play1.getName() + " win? ");
		try{
			BufferedReader tricks = new BufferedReader(new InputStreamReader(System.in));
			int tricksWon = Integer.parseInt(tricks.readLine());
			play1.setTricksWon(tricksWon);
			play2.setTricksWon(13-tricksWon);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.print("HEARTS: how many tricks did " + play2.getName() + " win? ");
		try{
			BufferedReader tricks = new BufferedReader(new InputStreamReader(System.in));
			int tricksWon = Integer.parseInt(tricks.readLine());
			play2.setTricksWon(tricksWon);
			play1.setTricksWon(13-tricksWon);
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.print("DIAMONDS: how many tricks did " + play1.getName() + " win? ");
		try{
			BufferedReader tricks = new BufferedReader(new InputStreamReader(System.in));
			int tricksWon = Integer.parseInt(tricks.readLine());
			play1.setTricksWon(tricksWon);
			play2.setTricksWon(13-tricksWon);
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.print("CLUBS: how many tricks did " + play2.getName() + " win? ");
		try{
			BufferedReader tricks = new BufferedReader(new InputStreamReader(System.in));
			int tricksWon = Integer.parseInt(tricks.readLine());
			play2.setTricksWon(tricksWon);
			play1.setTricksWon(13-tricksWon);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		if(play1.getTricksWon() > play2.getTricksWon()){
			System.out.print("NO TRUMP: how many tricks did " + play2.getName() + " win? ");
			try{
				BufferedReader tricks = new BufferedReader(new InputStreamReader(System.in));
				int tricksWon = Integer.parseInt(tricks.readLine());
				play2.setTricksWon(tricksWon);
				play1.setTricksWon(13-tricksWon);
			}catch(IOException e){
				e.printStackTrace();
			}
		}else{
			System.out.print("NO TRUMP: how many tricks did " + play1.getName() + " win? ");
			try{
				BufferedReader tricks = new BufferedReader(new InputStreamReader(System.in));
				int tricksWon = Integer.parseInt(tricks.readLine());
				play1.setTricksWon(tricksWon);
				play2.setTricksWon(13-tricksWon);
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		String winner;
		if(play1.getTricksWon() > play2.getTricksWon()){
			play1.addWin();
			play2.addLoss();
			winner = play1.getName();
		}else{
			play2.addWin();
			play1.addLoss();
			winner = play2.getName();
		}
		
		System.out.println("and the winner is " + winner + "!");
		return;
	}

}
