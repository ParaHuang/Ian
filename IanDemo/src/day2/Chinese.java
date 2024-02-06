package day2;

//inheritance:SubClass will inherite every public member from SuperClass
//class SubClass extends SuperClass{}
public class Chinese extends Human{//this
	//super->the object of SuperClass
	public Chinese() {
		//super() is using the constructor of SuperClass, by the format of values, we can be sure about which constructor it's using
		super(null,8);//using super() to create an object of SuperClass
	}
	
	//override: subclass has same method as superclass
	@Override
	public void eat() {
		System.out.println("Chinese eat with chopsticks");
	}
}

