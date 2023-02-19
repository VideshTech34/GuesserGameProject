package gameproject;

import java.util.Scanner;

class Guesser{
	
	int guessNum;
	
	 int guessingNumer(){
		System.out.println("Guess !Kinly guess the number");
		Scanner sc = new Scanner(System.in);
		
		guessNum = sc.nextInt();
		
		return guessNum;
		
		
	 }
	}
	 
	 class Player{
		 
		 int guessNum;
		int guessNumber(){
			 
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.println("Player ! Kindly guess the number");
			 
			 guessNum = sc.nextInt();
			 return guessNum;
		 }
	 }

	 
	 class Umpire{
		 
		 int numFromGuesser;
		 int numFromPlayer1;
		 int numFromPlayer2;
		 int numFromPlayer3;
		 
		void collectFromGuessor(){
			 
			 Guesser g = new Guesser();
			 
			numFromGuesser= g.guessingNumer();
			 
		 }
		 
		void collectFromPlayers(){
			
			Player p1 = new Player();
			Player p2 = new Player();
			Player p3 = new Player();
			
		numFromPlayer1=	p1.guessNumber();
		numFromPlayer2=	p2.guessNumber();
		numFromPlayer3=	p3.guessNumber();
			
			
			 
		 }
		 
		void compare(){
			if(numFromGuesser==numFromPlayer1) {
				if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
				System.out.println("All Players are winner : ");
			}
			else if(numFromGuesser==numFromPlayer2) {
				System.out.println("Player1 aur Player2 jeet gaye");
				
			}
			else if(numFromGuesser==numFromPlayer3) {
				System.out.println("Player3 won the Game");
				
			}
			else {
				System.out.println("Player1 won the Game : ");
			}
			 
		 }
			
			else if(numFromGuesser==numFromPlayer2) {
				
				System.out.println("Player2 aur Player3 jeet gaye");
				
				if (numFromGuesser==numFromPlayer3) {
					System.out.println("Player3 jeet Gaye: ");
				}
				
	 }
 if(numFromGuesser==numFromPlayer3) {
				
				
					System.out.println("Player3 jeet Gaye: ");
					
 }
				
 
 else {
	 System.out.println("Sare Har Gayer : ");
 }
 }
				
	 }
		
public class LaunchGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Game started : ");
		
		Umpire u = new Umpire();
		
		u.collectFromGuessor();
		u.collectFromPlayers();
		u.compare();

	}

}
