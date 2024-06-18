package day17;

public class Main3 {

	public static void main(String[] args) {
		try {
			Thread.sleep(1000);
			Class.forName("java.lang.String");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("the end");
		}
	}

}
