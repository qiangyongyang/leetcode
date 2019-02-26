package Lazy_pattern;

public class MyObject {
	private static volatile MyObject myObjet = null;
	
	private MyObject(){
		
	}
	
	public static MyObject getInstance(){
		if(myObjet == null){
			synchronized (MyObject.class) {
				if(myObjet == null){
					myObjet = new MyObject();
				}
			}
		}
		return myObjet;
	}
}
