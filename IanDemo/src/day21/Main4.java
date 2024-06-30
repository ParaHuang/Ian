package day21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("testdata.txt"));
		String msg;
		while((msg=br.readLine())!=null) {
			System.out.println(msg);
		}
	}

}
