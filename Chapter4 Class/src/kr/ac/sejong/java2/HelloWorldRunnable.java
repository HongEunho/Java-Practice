package kr.ac.sejong.java2;

public class HelloWorldRunnable implements Runnable{
	
	private String msg;
	
	
	public HelloWorldRunnable(String msg) {
		this.msg = msg;
	}


	@Override
	public void run() {
			System.out.println(msg);
			System.out.println(msg);
			System.out.println(msg);
			System.out.println(msg);
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = new HelloWorldRunnable("Hello");
		Thread t1 = new Thread(r1);
		
		System.out.println(t1.getName());
		t1.setName("HelloWorld");
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.getState());
		System.out.println(t1.getPriority());
		t1.setPriority(10);
		System.out.println(t1.getPriority());
		t1.start();
		System.out.println(t1.getState());
		Thread.sleep(1000);
		System.out.println(t1.getState()); 
	}
}
