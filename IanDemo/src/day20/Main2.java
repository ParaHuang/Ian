package day20;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main2 {

	public static void main(String[] args) {
		//save some content from code into file
		String msg = "\r\nhello, today is Saturday\r\nhola....";//->main2.txt
		
		//1.create an output stream object
		try {													//append or not
			OutputStream out = new FileOutputStream("main2.txt",true);
			out.write(msg.getBytes());
			
			//for any type of Stream, if we finished using it, then we close it
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
