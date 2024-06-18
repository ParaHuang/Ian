package day17;


public class Main1 {

	public static void main(String[] args)  {
		int a = 10;
		int b = 0;
		try {
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException excetpion) {
//			System.out.println("number can't be divided by 0");
			excetpion.printStackTrace();
		}
		
		try {
			fun1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("the rest code");
	
	}
	
	public static void fun1() throws ClassNotFoundException {
		Class.forName("jav.lang.Sting");
	}

}
//javascript: c->infinite
//Exception
//RuntimeException:suggest to avoid it by logic
//CompileException

//how to deal with Exception
//1.try...catch
/*
	try{
		the codes might have exception
	}catch(Xxx1Exception e1){
		the solution we make when exception happens
	}catch(Xxx2Exception e2){
		the solution we make when exception happens
	}finally{
		the code need be executed no matter there is exception or not
	}

we can catch different Exception by many catches 
or in 1 catch by Xxx1Exception | Xxx2Exception e
or just use Exception directly
*/

//2.throws: make a declaration about this method has an exception
//so wherever calls this method needs to deal with this exception
//don't make this declaration for main method








