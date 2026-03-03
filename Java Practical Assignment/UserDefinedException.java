class NegativeException  extends Exception{
	public NegativeException (String s){
		super(s);
	}
}
public class UserDefinedException{
	public static void main(String[] as) {
		try{
				throw new NegativeException("Hey Jay");
				}
		
	catch(NegativeException ne){
		System.out.println("Caught");
				System.out.println(ne);

		}
	}
}
