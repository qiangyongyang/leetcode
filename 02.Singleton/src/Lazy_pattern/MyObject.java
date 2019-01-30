package Lazy_pattern;

public class MyObject {
	private volatile static MyObject myObject;

	public static MyObject getInstance(){
		if(myObject == null){
			synchronized (MyObject.class) {
				if(myObject==null){
					myObject =new MyObject();
				}
			}
		}
		return myObject;
	}
}
