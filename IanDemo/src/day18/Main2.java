package day18;

import java.io.File;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		//a.file
		//b.folder/directory
		File folder = new File("hello");
		folder.mkdir();//create a folder
		
		File file = new File(folder, "abc.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//5.get absolute path
		System.out.println(file.getAbsolutePath());
		//6.get the name of this file
		System.out.println(file.getName());
		//7.get the absolute path of parent folder
		System.out.println(file.getParentFile().getAbsolutePath());
		System.out.println(file.getParent());//get the name of parent folder
		//8.rename a file
		file.renameTo(new File(folder,"ABC.TXT"));
		
	}

}
