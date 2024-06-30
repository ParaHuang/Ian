package day21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Main2 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("testdata.txt");
		char[] ch = new char[20];
//		reader.read(ch);
//		String msg = new String(ch);
//		System.out.println(msg);
		int len;
		String str = "";
		while((len=reader.read(ch))!=-1) {
			str += new String(ch,0,len);
		}
		System.out.println(str);
		reader.close();
	}

}
