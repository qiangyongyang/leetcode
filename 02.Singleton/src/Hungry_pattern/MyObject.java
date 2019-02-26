package Hungry_pattern;

public class MyObject {
	private static MyObject myObject = new MyObject();
	
	private MyObject() {
		// TODO Auto-generated constructor stub
	}
	
	public static MyObject getInstance(){
		return myObject;
	}
}
