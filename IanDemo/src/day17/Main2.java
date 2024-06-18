package day17;

public class Main2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		
		if(b==0) {
			System.out.println("can't / by 0");
		}else {
			int c = a/b;
			System.out.println(c);
		}
		
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
	}catch(XxxException exception){
		the solution we make when exception happens
	}

*/