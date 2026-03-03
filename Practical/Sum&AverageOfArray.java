class Sum_AverageOfArray{
	public static void main(String[] args) {
		int []numbers={2,-9,0,5,12,-25,22,9,8,12,-99};
		int sum=0;
		double average;
		for (int number:numbers ) {
			sum +=number;

			
		}
		int arrayLenght=numbers.lenght;
		average =((double)sum/(double)arrayLenght);
		System.out.println("Sum="+sum);
		System.out.println("Average="+average);			
	}
}