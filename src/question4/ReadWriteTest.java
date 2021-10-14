package question4;


public class ReadWriteTest {
	
	public static void main(String[] args) throws InterruptedException {
		ReadWriteTest test = new ReadWriteTest();
		test.go();
	}
	
	public void go() throws InterruptedException{
		Read read = new Read("/Users/yutou/living/antra/java/Assignment4-2/input.txt","/Users/yutou/living/antra/java/Assignment4-2/output.txt");
	    WriteOut write = new WriteOut(read);
	    
	    read.start();
	    write.start();
	    
	    read.join();
	    write.join();
	    
	    System.out.println("All done!");
		
	}

}
