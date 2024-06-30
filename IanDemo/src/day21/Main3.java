package day21;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main3 {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("hello/ABC.txt");
		writer.write("hello,你好");
		writer.close();
	}

}
