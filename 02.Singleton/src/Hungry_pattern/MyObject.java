package Hungry_pattern;

public class MyObject {
	private static MyObject myObject = new MyObject();

	public static MyObject getInstance() {
		return myObject;
	}
}
