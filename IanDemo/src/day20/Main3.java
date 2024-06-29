package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main3 {

	public static void main(String[] args) {
		//copy v1_add.png into /Users/parahuang/Desktop/Videos,save it as v1_add.png	
		try {
			//1.create InputStream object and OutputStream object
			InputStream in = new FileInputStream("v1_add.png");
			OutputStream out = new FileOutputStream("/Users/parahuang/Desktop/Videos/v1_add.png");
			//2.create byte array
			byte[] b = new byte[10*1024];
			//3.read
			int len;
			while((len=in.read(b))!=-1) {
				out.write(b,0,len);
			}
			out.close();
			in.close();
			//whoever create earlier, close later
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
