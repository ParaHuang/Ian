package day21;

public class Main6 {
	public static void main(String[] args) {
//		String str = "abbbbbbbbbbbbbbbbbbbcq";
//		
//		//meta character
//		//\w	matches 1 single letter or number or _
		
		
		
		//quantifier
		//+		at least 1 time
//		String regex = "ab+c\\w";    // "\\" ->   \
//		System.out.println(str.matches(regex));
		
		
		
		
		
		//check if an email address is valid
		
		//1.there are . and @
		//2.@ and .  can only show 1 time
		//3.@ and . cannot show in the beginning or in the end
		//4.@ has to be in front of . but not next to it
		
		String email = "ablsdjkflsjdf@skdjfskjdfB.com";
////		
		String regex = "\\w+@\\w+.\\w+";
////		
		if(email.matches(regex)) {
			System.out.println(email + " is valid");
		}else {
			System.out.println(email + " is not valid");
		}
	}
}
