package day22;

public class Main1 {

	public static void main(String[] args) {
		//Regular expression
		//meta character
		/*
		\w	match 1 single letter or number or _			\W	the opposite of \w
		\d	match 1 single number							\D	the opposite of \d	
		\s	match 1 single space character					\S	the opposite of \s	
		.	match every single character as long as it's not new line	
		[ui8q]	match u or i or 8 or q	
		[A-M]	match 1 letter in the range A to M
		[A-MU-Z4-8]	match 1 character in the range A to M or U to Z or 4 to 8
		[^range] match 1 character which is not in that range
		*/
		
		
		
		//quantifier
		/*
		{n}		n times
		{n,}	at least n times
		{n,m}	n to m times
		
		+		at least 1 time
		?		at most 1 time
		*		no matter how many times
		*/
		
		
		//other rule
		//choose:			|
		//capture and Select Invert ： 
		//ignore case : (?i)
		
		
		
		
		//1.the method from String
		//regex of password: the length should be at least 6, at most 12,start with a upper case, then comes with letter or number or _ 
//		String regex = "[A-Z]\\w{5,11}";
//		System.out.println("G123456789000".matches(regex));//return true if the content suit for the regex rule
		
//		String regex = "(\\d\\w)*";
//		System.out.println("9_5a8i0o1f".matches(regex));
		
//		String regex = "Jack|Tom|Alex|Lily";
//		System.out.println("Tom".matches(regex));
		
//		String regex = "Jack|To(m|A)lex|Lily";
//		System.out.println("ToAlex".matches(regex));
		
		//month:1-12
		//1-9  or  
		//10-12: 1_
//		String regex = "[1-9]|1[0-2]";
//		System.out.println("12".matches(regex));
		
		//date:1-31
		//1-9	or
		//10~19		1\d
		//20~29		2\d
		//30~31		30|31			3[01]
//		String regex = "[1-9]|[12]\\d|3[01]";
//		System.out.println("3".matches(regex));
		
		String email = "a@b.c";
		String regex = "\\w+@\\w+[.]\\w+";
		
		if(email.matches(regex)) {
			System.out.println(email + " is valid");
		}else {
			System.out.println(email + " is not valid");
		}

		System.out.println( Integer.MIN_VALUE);
		
		
		//2.Matcher object
	}

}













