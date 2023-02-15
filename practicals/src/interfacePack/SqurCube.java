package interfacePack;
interface Printable
{
	void print();
}
interface Calculate
{
	void cal();
}
class CalSquare implements Printable, Calculate 
{
	public void print()
	{
		System.out.println("this is a square class");
	}
	public void cal()
	{
		int a,s=5;
		a=s*s ;
		System.out.println("The number of square:"+a);
	}
	
}
class CalCube implements Printable, Calculate 
{
	public void print()
	{
		System.out.println("this is a Cube class");
	}
	public void cal()
	{
		int a,n=5;
		a=n*n*n ;
		System.out.println(" The number of Cube is:"+a);
	}
	
}
class SqurCube
{
	public static void main(String args[])
	{
		CalSquare s1=new CalSquare();
		s1.cal();
		s1.print();
		CalCube c1=new CalCube();
		c1.cal();
		c1.print();
	}
}


