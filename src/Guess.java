package question6;
import java.util.Scanner;

public class Guess {
	IntRange range;
	
	public Guess(){
		range = new IntRange();
		
	}
	
	public int guessGame(){
		int k = this.range.guess();
		Scanner scanner= new Scanner(System.in);
		String s = play(k, scanner);
		return guessGame(k, s, scanner);
	}
	
	private int guessGame(int k, String s, Scanner scanner){
		if(s.equals("higher")){
			this.range.setLow(k);
			k = this.range.guess();
			s = play(k, scanner);
			return guessGame(k, s, scanner);
		}if(s.equals("lower")){
			this.range.setHigh(k);
			k = this.range.guess();
			s = play(k, scanner);
			return guessGame(k, s, scanner);
		}else{
			return k;
		}
	}
	
	public static String play(int k, Scanner scanner){
		System.out.println("Is it " + k + "?");
		String s = scanner.next();
		return s;
	}
	
	public static void main (String[] args){
		Guess guess = new Guess();
		guess.guessGame();
	}
}
