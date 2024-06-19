package day18;
//.java->.class   classpath
import java.io.File;
import java.io.IOException;

//File operating
//1.the file
//2.the content in file
public class Main1 {

	public static void main(String[] args) {
		//1.create an file object based on a path(ps: this file doesn't have to exist,but the parent path has to be correct)
		//absolute path: C:/folder1/folder2/abc.txt
//		File file = new File("/Users/parahuang/Desktop/error.txt");
		//							parent path				file path
//		File file = new File("/Users/parahuang/Desktop","error.txt");
		
		//relative path: look for something from the current position
		File file = new File("abc.txt");
		
		/*
		//2.check if this file exist
		boolean f1 = file.exists();
		System.out.println(f1);
		
		//3.create a file
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//4.delete a file
//		file.delete();
		*/
		
		//see if a file exist, if yes, delete it, otherwise create it
		if(file.exists()) {
			file.delete();
		}else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}









