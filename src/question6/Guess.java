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
		char c = play(k, scanner);
		return guessGame(k, c, scanner);
	}
	
	private int guessGame(int k, char c, Scanner scanner){
		if(c == 'H'){
			this.range.setLow(k);
			k = this.range.guess();
			c = play(k, scanner);
			return guessGame(k, c, scanner);
		}if(c == 'L'){
			this.range.setHigh(k);
			k = this.range.guess();
			c = play(k, scanner);
			return guessGame(k, c, scanner);
		}else{
			return k;
		}
	}
	
	public static char play(int k, Scanner scanner){
		System.out.println("Is it " + k + "?");
		String s = scanner.next();
			if(s.equals("higher")){
				return 'H';
			}else if(s.equals("lower")){
				return 'L';
			}else{
				return 'Y';
			}
	}
	
	public static void main (String[] args){
		Guess guess = new Guess();
		guess.guessGame();
	}
}
