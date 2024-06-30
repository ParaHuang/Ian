package day21;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main1 {

	public static void main(String[] args) throws IOException {
		File file = new File("v1_add.png");
		InputStream in = new FileInputStream(file);
		OutputStream out = new FileOutputStream("/Users/parahuang/Desktop/Videos/v1_add.png");
		//2.create byte array
		byte[] b = new byte[10*1024];
		//3.create a middle place to save all the byte from original file
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//4.read
		int len;
		while((len=in.read(b))!=-1) {
			baos.write(b, 0, len);
		}
		//5.write
		out.write(baos.toByteArray());
		
		out.close();
		in.close();
		
		//cut
		file.delete();
	}

}
