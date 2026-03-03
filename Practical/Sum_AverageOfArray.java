//Why compiletin errors occurs in this program?
class Sum_AverageOfArray{
	public static void main(String[] args) {
		int[]numbers={2,-9,0,5,12,-25,22,9,8,12,};
		int sum=0;
		double average;
		
		for (int num:numbers ) {
			sum +=num;	
		}
		int arrayLengh=numbers.lengh;
		average =((double)sum/(double)arrayLengh);
		System.out.println("Sum="+sum);
		System.out.println("Average="+average);			
	}
}