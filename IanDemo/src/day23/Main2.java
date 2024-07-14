package day23;

public class Main2 {
	public static void main(String[] args) {
		String regex = "(?i)asshole|shit";	//regex for bad words
		
		String content = "hello ASSHOLE Asshole. you SHIT. shit";  //bad word->***
//		content = content.replace("shit", "***");
//		System.out.println(content);
//		content = content.replace("asshole", "***");
		
		content = content.replaceAll(regex, "***");
		System.out.println(content);
		
		
		String data = "87. 5. 8. 9. 7. 4. 6. 3. 9. 0. 2";
		data = data.replace(" ", "");
		System.out.println(data);
		String[] ary = data.split("[.]");
		System.out.println(ary.length);
		for(String s:ary) {
			int num = Integer.parseInt(s);
			System.out.println(num);
		}
	}
}
