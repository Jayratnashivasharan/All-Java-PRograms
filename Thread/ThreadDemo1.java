class myThread implements Runnable{
	public void run(){
		for (int i=1;i<=5 ;i++ ) {
				System.out.println("Inside the child"+i);
				try{Thread.sleep(500);}catch(Exception e){}
	}
	}
}
class ThreadDemo1{
 public static void main(String[] args) {
 		for (int i=1;i<=5 ;i++ ) {
 			System.out.println("Inside the Main"+i);
				try{Thread.sleep(1000);}catch(Exception e){}
 		}
		myThread t=new myThread();
		Thread t1=new Thread(t);
		t1.start();
	}
}