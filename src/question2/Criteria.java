package question2;
import java.io.File;

public class Criteria {
	File file;
	Boolean include;
	String extension;
	
	public Criteria(String folderPath, Boolean include, String extension){
		this.file = new File(folderPath);
		this.include = include;
		this.extension = extension;
	}
	
	public void count(){
		File[] files = file.listFiles();
		int fileNumber = 0;
		int folderNumber = 0;
		for (File f : files)
			if(f.isDirectory()){
				folderNumber++;
			}else if(f.getName().endsWith(extension)){
				fileNumber++;
			}
		if(include){
			System.out.println("There are " + folderNumber + " folders and " + fileNumber + " files with extension " + extension);
		}else{
			System.out.println("There are " + fileNumber + " files with extension " + extension);
		}
	}
	
	public static void main(String[] args){
		Criteria criteria= new Criteria("/Users/yutou/living",true,".rtf");
		criteria.count();
	}
}
