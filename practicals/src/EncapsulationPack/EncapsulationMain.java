package EncapsulationPack;

public class EncapsulationMain 
{
	public static void main(String args[])
	{
		EncapsulationExample e1=new EncapsulationExample();
		e1.setRoll_no(101);
		e1.setName("Aishwarya");
		System.out.println(e1.getRoll_no());
		System.out.println(e1.getName());
	}
}
