package Question1;
import java.util.Scanner;

public class sumOneToX {
	public static void main (String[] args){
		Scanner scanner= new Scanner(System.in);
		try{
			System.out.println("Enter an integer");
			int i = scanner.nextInt();
			if (i<=0){
				throw new java.util.InputMismatchException("Input is less or equal to zero.");
			}
			else{
				int sum = 0;
	            for (int j=0;j<=i;j++){
	            	sum += i;
	            }
	            System.out.println("The sum is " + sum);
			}
		}finally{
			scanner.close();
		}	
	}
}
