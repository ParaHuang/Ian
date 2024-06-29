package day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main2 {

	public static void main(String[] args) {
		//action				direction			stream(all type of file)		(text file)
		//read					in					InputStream						Reader
		//write					out					OutputStrem						Writer
		//											byte							character
		
		
		//read content from file, and print them in console
		try {
			File f = new File("testdata.txt");
			InputStream in = new FileInputStream(f);
			/*
			//1.read 1 byte, return the ASCII code of the content you just read
			int x = in.read();
			System.out.println((char)x);
			int y = in.read();
			System.out.println((char)y);
			*/
			
			//2.read the content into byte array,read how much depends by the size of byte array
			byte[] b = new byte[(int) f.length()];	
			in.read(b);
			String msg = new String(b);
			System.out.println(msg);
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
