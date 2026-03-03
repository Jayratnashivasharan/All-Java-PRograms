class MyThread extends Thread{
	private String threadName;
	MyThread(String name){
		threadName = name;
	}
	public void run(){
		System.out.println("Thread" + threadName + "is running.");
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			System.out.println("Thread"+ threadName+"Interrupted.");
		}
		System.out.println("Thread"+threadName+"exiting.");
	}
}
public class Q1{
	public static void main(String[] args) {
		MyThread thread1 = new MyThread("Thread 1");
		MyThread thread2 = new MyThread("Thread 2");
		thread1.start();
		thread2.start();

	}
}