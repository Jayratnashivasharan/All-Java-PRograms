class mythread extends Thread{
	public void run(){
		for (int i=1;i<=5 ;i++ ) {
		System.out.println("Inside the Thread child"+i);
	try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}
class ThreadDemo
{
	public static void main(String args[]){
		for (int i=1; i<=5;i++) {
			System.out.println("Inside the Thread"+i);
	try{Thread.sleep(1000);}catch(Exception e){}
		
		}
		mythread t=new mythread();
		t.start();
	}
} 