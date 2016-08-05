package question4;

public class WriteOut extends Thread{
	
	private Read read;
	
	public WriteOut(Read read){
		this.read = read;
	}
	
	@Override
	public void run(){
		for(int i=0;i<30;i++){
			try{
				read.writeOut();
			}catch(Exception e){
				break;
			}
		}
		
	}
	
}
