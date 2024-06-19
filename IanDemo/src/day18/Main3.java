package day18;

import java.io.File;
import java.io.IOException;

public class Main3 {

	public static void main(String[] args) {
		File folder = new File("/Users/parahuang/Desktop/PointsOfInterest");
		
		File[] fs = folder.listFiles();
		for(File f:fs) {
			/*
			//rename all file
//			System.out.println(f.getName());
			//rename every file/folder into capital.      app->APP   .DS_Store->.DS-STORE     NAME->NAME
			//1.get the original name
			String orginalName = f.getName();
			
			//2.change the name into capital name
			String newName = orginalName.toUpperCase();
			
			//3.rename it
			f.renameTo(new File(folder,newName));
			*/
			
			String name = f.getName();
			//see if a file is a picture: ends with png/jpg/jpeg/gif
			
//			if(name.endsWith("png")||name.endsWith("jpg")||name.endsWith("jpeg")||name.endsWith("gif"))
//				System.out.println("under this folder, "+name+" is a picture");
			
			//hello.abc.xyz.png
			String suffix = name.substring(name.lastIndexOf(".")+1).toLowerCase();
			if(suffix.equals("png")||suffix.equals("jpg")||suffix.equals("jpeg")||suffix.equals("gif"))
				System.out.println("under this folder, "+name+" is a picture");
			
			
		}
	}

}

//Regular expression


















