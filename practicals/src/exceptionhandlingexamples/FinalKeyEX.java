package exceptionhandlingexamples;

public class FinalKeyEX {

	public static void main(String[] args) 
	{
		int i=20,j=0;
		System.out.println("I am before calculation ");
		try {
			System.out.println(i/j);
		}
		catch(Exception e) {
			System.out.println("Exception is fired");
			
		}
		finally {
			System.out.println("I am after calculation");
		}

	}

}
