package question4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

public class Read extends Thread{
	private File inputFile;
	FileReader fileReader;
	BufferedReader bufferedReader;
	List<String> equationList;
	ScriptEngineManager mgr = new ScriptEngineManager();
	ScriptEngine engine = mgr.getEngineByName("JavaScript");
	FileWriter fileWriter;
	BufferedWriter outPut;

	public Read(String in, String out){
		try{
			inputFile = new File(in);
			fileReader = new FileReader(inputFile);
			fileWriter = new FileWriter(out,true);
			outPut = new BufferedWriter(fileWriter);
			bufferedReader = new BufferedReader(fileReader);
			equationList = new ArrayList<String>();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void run(){
		while(true){
			try{
				readIn();
			}catch(Exception e){
				break;
			}
		}
//		System.out.println(equationList);
	}
	
	public synchronized void readIn() throws Exception{
		System.out.println("It is reading.");
		String line;
		line = bufferedReader.readLine();
		if(!line.isEmpty()){
			StringBuffer s = new StringBuffer();
			s.append(line);
			s.append(" = ");
			s.append(engine.eval(line));
			s.append("\n\n");
			equationList.add(s.toString());
		}
		notify();
	}
	
	public synchronized void writeOut() throws Exception{
		if(equationList.size()<1){
			wait();
		}
		System.out.println("It is writing.");
		String s = equationList.get(0);
		System.out.println(s);
		outPut.write(s);
		outPut.flush();
		equationList.remove(0);
	}
	
//	public static void main(String[] args){
//		Read read = new Read("/Users/yutou/living/antra/java/Assignment4-2/input.txt","/Users/yutou/living/antra/java/Assignment4-2/output.txt");
//		read.run();
//	}
}