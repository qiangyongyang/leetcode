package static_method;

public class MyObject {
	/*private static MyObject myObject =  null;
	
	private MyObject() {
		// TODO Auto-generated constructor stub
	}
	static{
		myObject = new MyObject();
	}
	public static MyObject getInstance(){
		return myObject;
	}*/
	
	
	private static MyObject myObject = null;
	
	private MyObject(){
		
	}
	
	static{
		myObject = new MyObject();
	}
	
	public static MyObject getInstance(){
		return myObject;
	}
}
