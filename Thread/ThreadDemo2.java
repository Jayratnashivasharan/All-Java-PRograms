class mythread extends Thread{
	public void run(){
		System.out.println("Thread Name:"+Thread.currentThread().getName());
		System.out.println("Thread Id:"+Thread.currentThread().getId());
		System.out.println("Thread priority:"+Thread.currentThread().getPriority());

	}
}
class ThreadDemo2{
	 public static void main(String[] args) {
		mythread m1=new mythread();
		m1.setName("Jay");
		m1.setPriority(Thread.NORM_PRIORITY);
		m1.setPriority(Thread.MAX_PRIORITY);
		m1.setPriority(Thread.MIN_PRIORITY);

		m1.start();
	}
}