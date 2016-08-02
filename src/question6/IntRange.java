package question6;

public class IntRange {
	int low;
	int high;
	
	public IntRange(){
		low = -1000;
		high = 1000;
	}
	
	public void setLow(int k){
		low = k;
	}
	
	public void setHigh(int k){
		high = k;
	}
	
	public int guess(){
		return((low+high)/2);
	}
}
