package day20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main1 {

	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("testdata.txt");
			
			byte[] b = new byte[30];	//1024byte = 1KB   1024KB=1MB
			//using input stream to read file, save the content you just read into byte array
			//return the size of the content you just read
			String content = "";
			/*
			while(true) {
				int len = in.read(b);
				if(len==-1) {
					break;
				}
				//		which byte array to convert		from where		convert how many
				String msg = new String(b, 					0, 				len);
				content+=msg;
			}
			*/
			int len;
			while((len=in.read(b)) != -1 ) {
				String msg = new String(b, 0, len);
				content+=msg;
			}		
			System.out.println(content);
			
			
			
			/*
			int len1 = in.read(b);			//30
			String msg = new String(b);
			System.out.print(msg);
			
			in.read(b);
			String msg2 = new String(b);
			System.out.print(msg2);
			
			in.read(b);
			String msg3 = new String(b);
			System.out.print(msg3);
			
			in.read(b);
			String msg4 = new String(b);
			System.out.print(msg4);
			
			int len5 = in.read(b);
			String msg5 = new String(b);
			System.out.print(msg5);
			
			int len6 = in.read(b);
			String msg6 = new String(b);
			System.out.print(msg6);
			
			int len7 = in.read(b);
			String msg7 = new String(b);
			System.out.print(msg7);
			System.out.println();
			System.out.println(len1+" "+len5+" "+len6+" "+len7);
			*/
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
