package static_method;

public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}

}
