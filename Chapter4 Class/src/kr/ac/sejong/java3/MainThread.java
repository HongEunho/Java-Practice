package kr.ac.sejong.java3;

public class MainThread {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());
		System.out.println(mainThread.getId());
		System.out.println(mainThread.getState());
		System.out.println(mainThread.getPriority());
	}

}
