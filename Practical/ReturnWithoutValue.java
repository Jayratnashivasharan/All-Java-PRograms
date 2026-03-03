class ReturnWithoutValue{
	void increment(int num){
		if(num<10)
			return;
			num++;
		System.out.println(num);

	}
	 public static void main(String[] args) {
		ReturnWithoutValue obj=new ReturnWithoutValue();
		obj.increment(4);
		System.out.println("In main");
		obj.increment(12);
		System.out.println("In main");	
	}
}	