package day23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {

	public static void main(String[] args) {
		//1.define a rule
		Pattern pattern = Pattern.compile("(?i)asshole|shit");
		//2.use rule to check some content, then get the matcher object
		String content = "hello ASSHOLE Asshole. you SHIT. shit";
		Matcher matcher = pattern.matcher(content);
		//3.
//		boolean f1 = matcher.find();	//->if you find the content
//		System.out.println(f1);
//		String s1 = matcher.group();//->returns the content
//		System.out.println(s1);
//
//		boolean f2 = matcher.find();	//->if you find the content
//		System.out.println(f2);
//		String s2 = matcher.group();//->returns the content
//		System.out.println(s2);
//		int count=0;
		//shit -> s**t  asshole->a*****e
		while(matcher.find()) {
			String str = matcher.group();
			System.out.println(str);
			String newContent = str.substring(0, 1) 	//first letter of old content
					+ str.substring(1, str.length()-1).replaceAll("\\w", "*")//old Content -> *****
					+ str.substring(str.length()-1); 	//last letter of old content
			content = content.replaceFirst(str, newContent);
//			count++;
		}
		System.out.println(content);
//		System.out.println("you valid the rule of this websit since you used "+ count+" bad words");
		
	}

}
