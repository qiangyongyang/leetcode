package static_method;

public class MyObject {
	private static MyObject myObject =  null;
	static{
		myObject = new MyObject();
	}
	public static MyObject getInstance(){
		return myObject;
	}
}
